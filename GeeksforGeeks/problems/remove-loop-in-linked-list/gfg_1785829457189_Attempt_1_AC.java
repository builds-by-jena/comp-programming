if (head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                break;
        }

        // No loop
        if (fast == null || fast.next == null)
            return;

        // Loop starts at head
        if (slow == head) {
            while (fast.next != head)
                fast = fast.next;
            fast.next = null;
            return;
        }

        // Find node before start of loop
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Break loop
        fast.next = null;
    }
}