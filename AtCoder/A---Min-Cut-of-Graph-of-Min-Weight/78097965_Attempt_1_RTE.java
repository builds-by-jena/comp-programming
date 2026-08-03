import java.util.*;

public class Main {

    static class Edge {
        int to;
        long w;

        Edge(int to, long w) {
            this.to = to;
            this.w = w;
        }
    }

    static int N;
    static ArrayList<Edge>[] graph;

    static int LOG = 20;
    static int[][] parent;
    static long[][] minEdge;
    static int[] depth;

    static void dfs(int u, int p, long w) {
        parent[0][u] = p;
        minEdge[0][u] = w;

        for (Edge e : graph[u]) {
            if (e.to == p) continue;

            depth[e.to] = depth[u] + 1;
            dfs(e.to, u, e.w);
        }
    }

    static void build() {
        for (int k = 1; k < LOG; k++) {
            for (int i = 1; i <= N; i++) {

                int mid = parent[k - 1][i];

                if (mid == 0) {
                    parent[k][i] = 0;
                    minEdge[k][i] = minEdge[k - 1][i];
                } else {
                    parent[k][i] = parent[k - 1][mid];
                    minEdge[k][i] = Math.min(
                            minEdge[k - 1][i],
                            minEdge[k - 1][mid]
                    );
                }
            }
        }
    }

    static long minimumEdgeOnPath(int u, int v) {

        long ans = Long.MAX_VALUE;

        if (depth[u] < depth[v]) {
            int t = u;
            u = v;
            v = t;
        }

        int diff = depth[u] - depth[v];

        for (int k = LOG - 1; k >= 0; k--) {
            if (((diff >> k) & 1) == 1) {
                ans = Math.min(ans, minEdge[k][u]);
                u = parent[k][u];
            }
        }

        if (u == v)
            return ans;

        for (int k = LOG - 1; k >= 0; k--) {

            if (parent[k][u] != parent[k][v]) {

                ans = Math.min(ans, minEdge[k][u]);
                ans = Math.min(ans, minEdge[k][v]);

                u = parent[k][u];
                v = parent[k][v];
            }
        }

        ans = Math.min(ans, minEdge[0][u]);
        ans = Math.min(ans, minEdge[0][v]);

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++)
            graph[i] = new ArrayList<>();

        for (int i = 0; i < N - 1; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();
            long w = sc.nextLong();

            graph[u].add(new Edge(v, w));
            graph[v].add(new Edge(u, w));
        }

        parent = new int[LOG][N + 1];
        minEdge = new long[LOG][N + 1];
        depth = new int[N + 1];

        Arrays.fill(minEdge[0], Long.MAX_VALUE);

        dfs(1, 0, Long.MAX_VALUE);

        build();

        long answer = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                answer += minimumEdgeOnPath(i, j);
            }
        }

        System.out.println(answer);
    }
}