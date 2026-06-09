class DynamicArray {
    int[] arr;
    int size;
    int cap;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.size = 0;
        this.cap = capacity;
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(this.size == this.cap){
            this.resize();
        }
        this.arr[size] = n;
        this.size += 1;
    }

    public int popback() {
        this.size = this.size-1;
        return this.arr[this.size];
    }

    private void resize() {
        int[] temp = new int[this.cap*2];
        for(int i=0 ; i<cap;i++ ){
            temp[i] = this.arr[i];
        }
        this.arr = temp;
        this.cap *= 2;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.cap;
    }

}
