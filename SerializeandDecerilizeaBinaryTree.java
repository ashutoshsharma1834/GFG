class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        if (root == null)
            return new ArrayList<Integer>();

        ArrayList<Integer> serializeLeft = serialize(root.left);
        ArrayList<Integer> serializeRight = serialize(root.right);

        serializeLeft.add(root.data);
        serializeLeft.addAll(serializeRight);
        return serializeLeft;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        if (arr.size() == 0) {
            return null;
        }
        int mid = arr.size() / 2;
        Node newNode = new Node(arr.get(mid));
        ArrayList<Integer> leftArr = new ArrayList<>(arr.subList(0, mid));
        Node leftNode = deSerialize(leftArr);
        ArrayList<Integer> rightArr = new ArrayList<>(arr.subList(mid + 1, arr.size()));
        Node rightNode = deSerialize(rightArr);
        newNode.left = leftNode;
        newNode.right = rightNode;
        return newNode;
    }
};