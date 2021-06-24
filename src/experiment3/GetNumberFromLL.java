package experiment3;

import java.util.ArrayList;

public class GetNumberFromLL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        GetNumberFromLL obj = new GetNumberFromLL();
        System.out.println(obj.getNumber(list));

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList() ;
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(8);
        singlyLinkedList.addLast(6);
        singlyLinkedList.addLast(2);
        System.out.println(obj.getNumber(singlyLinkedList));
    }
    public int getNumber(ArrayList<Integer> list){
        int response = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        response = Integer.parseInt(sb.toString());
        return response;
    }

    public int getNumber(SinglyLinkedList list){
        int response = 0;
        Node temp = list.getHead();
        String number = "";
        while(temp != null){
            number = number + temp.getData();
            temp = temp.getNext();
        }
        response = Integer.parseInt(number);
        return response;
    }


}
