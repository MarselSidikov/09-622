package ru.ivmiit.map.tree;

import ru.ivmiit.map.Map;

public class MapTreeImpl implements Map {
    private class Node {
        private int key;
        private String value;
        Node left;
        Node right;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root;

    public void put(int key, String value) {
        // мой корень указвает на дерево с этим же корнем, но с добавленым
        // элементом
        root = putRecursive(root, key, value);
    }

    private Node putRecursive(Node currentRoot, int key, String value) {
        // если добрались до дна дерева
        if (currentRoot == null) {
            // создаем лист
            currentRoot = new Node(key, value);
        } else if (currentRoot.key > key) {
            currentRoot.left = putRecursive(currentRoot.left, key, value);
        } else if (currentRoot.key < key){
            currentRoot.right = putRecursive(currentRoot.right, key, value);
        } else {
            currentRoot.value = value;
        }

        return currentRoot;
    }

    public String get(int key) {
        return getRecursive(root, key);
    }

    private String getRecursive(Node root, int key) {
        if (root == null) {
            return null;
        } else if (root.key > key) {
            return getRecursive(root.left, key);
        } else if (root.key < key) {
            return getRecursive(root.right, key);
        } else {
            return root.value;
        }
    }

    public void show() {
        showTreeRecursive(root, 0);
    }

    // выводит дерево с корнем currentRoot с уровнем level
    private void showTreeRecursive(Node currentRoot, int level) {
        if (currentRoot != null) {
            showTreeRecursive(currentRoot.right, level + 1);

            for (int i = 0; i < level; i++)
            {
                System.out.print("--");
            }

            System.out.println(currentRoot.key + "=" + currentRoot.value);

            showTreeRecursive(currentRoot.left, level + 1);
        }
    }
}
