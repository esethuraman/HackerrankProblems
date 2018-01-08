package AddBinary;

public class FirstTry {
    public String addBinary(String a, String b) {
        char[] aArr, bArr;
        aArr = a.toCharArray();
        bArr = b.toCharArray();

        StringBuilder sb = new StringBuilder();
        char carryOver = '0', first, second, temp;

        for(int i=aArr.length-1, j=bArr.length-1;
            (i>=0) || (j>=0) ; i--, j--){
            first = second = '0';
            if((i>=0) && (j>=0)){
                first = aArr[i];
                second = bArr[j];
            }
            else if((i>=0)){
                first = aArr[i];
            }
            else{
                second = bArr[j];
            }

            // when only one operand is '1'
            if(first != second){
                if(carryOver == '1'){
                    carryOver = '1';
                    temp = '0';
                }
                else{
                    carryOver = '0';
                    temp = '1';
                }
            }
            else if((first == second) &&  (first == '1')){

                if(carryOver == '1'){
                    temp = '1';
                }
                else{
                    temp = '0';
                }
                carryOver = '1';
            }
            else{
                temp = carryOver;
                carryOver = '0';
            }
//            System.out.println(temp);
            sb.insert(0, temp);
        }

        // for the last carryOver if any at the MSB
        if(carryOver == '1'){
            sb.insert(0, carryOver);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        FirstTry obj = new FirstTry();
//        System.out.println(obj.addBinary("11", "01"));
//        System.out.println(obj.addBinary("11", "11"));
        System.out.println(obj.addBinary("0", "0"));
    }
}
