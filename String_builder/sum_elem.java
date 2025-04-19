
class  Add{
    public void  add(int... numbers){
        int sum=0;
        StringBuilder output=new StringBuilder();
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            output.append(numbers[i]);

            if(i<numbers.length-1){
                output.append("+");
            }
        }
        output.append("=").append(sum);
        System.out.println(output);

    }
}
public class sum_elem {
    public static void main(String[] args) {
        Add obj=new Add();
        obj.add(1,2);
        obj.add(1,2,3);
        obj.add(1,2,3,4);
        obj.add(1,2,3,4,5);
        obj.add(1,2,3,4,5,6); // Output: 1+2+3+4+5+6=21
    
    }

     
}
