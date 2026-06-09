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
        System.out.println("get "+this.arr[i]);
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
        System.out.println("set array index "+i+". element "+this.arr[i]);
        this.printArray();
    }

    public void pushback(int n) {
        if(this.size == this.cap){
            this.resize();
        }
        this.arr[size] = n;
        this.size += 1;
        this.printArray();
    }

    public int popback() {
        this.size = this.size-1;
        System.out.println("popback size "+this.size);
        System.out.println("popback "+this.arr[this.size]);
        return this.arr[this.size];
    }

    private void resize() {
        int[] temp = new int[this.cap*2];
        for(int i=0 ; i<cap;i++ ){
            temp[i] = this.arr[i];
        }
        this.arr = temp;
        this.cap *= 2;
        System.out.println("resize capacity"+this.cap);
    }

    public int getSize() {
        System.out.println("Size "+this.size);
        return this.size;
    }

    public int getCapacity() {
        System.out.println("Capacity "+this.cap);
        return this.cap;
    }

    public void printArray(){
        System.out.println("Array ");
        for(int i : this.arr){
            System.out.print(i);
        }
    }
}
