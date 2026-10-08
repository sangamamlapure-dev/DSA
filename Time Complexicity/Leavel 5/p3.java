for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - i; j++) {
        for (int k = 0; k < n - j; k++) {
            System.out.println(i + j + k);
        }
    }
}


//O(n3)