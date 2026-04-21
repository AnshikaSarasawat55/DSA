public class DynamicStack extends CustomStack {
    DynamicStack(){
        super();

    }
    DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        // this takes care of it being full
        if(isFull()){
            //double the size
            int[] temp=new int[data.length *2];
            //copy all the elements
            for (int i =0;i< data.length;i++){
                temp[i] = data[i];

            }
            data = temp;
        }
        // at this point we know that array is not full
        //insert item
        return super.push(item);
    }
}
