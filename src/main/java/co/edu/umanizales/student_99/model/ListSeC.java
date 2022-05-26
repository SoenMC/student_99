package co.edu.umanizales.student_99.model;

import lombok.Data;
@Data

public class ListSeC {

    private Node head;
    private int count;

    public Node enlist()
    {
        ListSE list = new ListSE();
        if (this.head != null)
        {
            Node temp = this.head;
            list.add(temp.getData());
            while (temp.getNext() != this.head)
            {
                list.add(temp.getNext().getData());
                temp = temp.getNext();
            }
        }
        return list.getHead();
    }

    public void addToStart(Pet pet)
    {
        if(head == null)
        {
            head = new Node(pet);
            head.setNext(head);                      //head = head.getNext();
        }
        else
        {
            Node temp = head;
            while(temp.getNext() != head)
            {
                temp=temp.getNext();
            }
            temp.setNext(new Node(pet));
            temp.getNext().setNext(head);
            head =  temp.getNext();

        }
        this.count++;

    }
    public void addToEnd(Pet pet)
    {
        if(head == null)
        {
            head = new Node(pet);
            head.setNext(head);
        }
        else
        {
            Node temp =  head;
            while (temp.getNext() != head)
            {
                temp = temp.getNext();
            }
            temp.setNext(new Node(pet));
            temp.getNext().setNext(head);
        }
    }
    public AvgFleas cantFlea() {
        if (this.head == null)
        {
            return new AvgFleas(0,0);
        }
        int countH = 0;
        int countM = 0;
        int cantFleasH = 0;
        int cantFleasM = 0;
        float promH = 0;
        float promM = 0;

        Node temp = head;
                while (temp.getNext() != head)
                {
                    if (temp.getData().getGender() == 'M')
                    {
                        cantFleasM = cantFleasM + temp.getData().getFlea();
                        countM++;
                    }
                    else
                    {
                        if (temp.getData().getGender() == 'H')
                        {
                            cantFleasH = cantFleasH + temp.getData().getFlea();
                            countH++;
                        }
                    }
                    temp = temp.getNext();
                }
                promM = (cantFleasM / countM);
                promH = (cantFleasM/countM);
        return new AvgFleas(promM,promH);
    }
}
