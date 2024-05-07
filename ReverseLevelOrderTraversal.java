
class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node node) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        qu.add(node);
        while (!qu.isEmpty()) {
            Node curr = qu.remove();
            st.add(curr.data);
            if (curr.right != null)
                qu.add(curr.right);
            if (curr.left != null)
                qu.add(curr.left);
        }
        while (!st.isEmpty())
            list.add(st.pop());
        return list;
    }
}