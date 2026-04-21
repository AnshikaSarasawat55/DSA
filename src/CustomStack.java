public class CustomStack {
        protected int[] data;
        private static final int DEFAULT_SIZE = 10;
        int ptr=-1;
        public CustomStack(){
            this ( DEFAULT_SIZE );
        }
        public CustomStack(int size) {
            this.data=new int[size];
        }
        public boolean push(int item){
            if (!isFull()) {
                ptr++;
                data[ptr] = item;
                return true;
            } else {
                System.out.println(" stack is full");
                return false;
            }
        }
        public int pop()throws Exception{
            if(isEmpty()){
                throw new Exception("cannot pop from of a empty stack");
            }
            int removed=data[ptr];
            ptr--;
            return removed;
        }
        public int peek() throws Exception{
            if(isEmpty()){
                throw new Exception("cannot peek from of a empty stack");
            }
            return data[ptr];
        }

        public  boolean isFull() {
            return ptr == data.length-1;
        }
        private boolean isEmpty() {
            return ptr == -1;
        }

    }


