package co.edu.umanizales.student_99.model;


import lombok.Data;
@Data

public class ListSE {
    private Node head;
    private int count;


    public void add(Pet pet)
    {
        if (this.head == null)
        {
            this.head = new Node(pet);
        }
        else
        {
            Node temp = this.head;
            while (temp.getNext() != null)
            {  //asi se hace el recorrido
                temp = temp.getNext();
            }
            //parado en el ultimo
            temp.setNext(new Node(pet));
        }
    }
    //set asignar y get leer y (throws Exception) es porque puede fallar

    public void addToStart(Pet pet)
    {
        if(this.head == null)
        {
            head = new Node(pet);
        }
        else
        {
            Node newNode = new Node(pet);
            newNode.setNext(head);
            this.head = newNode;
        }
        count++;
    }
    public void addToPosition(int position, Pet pet) throws Exception
    {
        if(position > 0 && position <= this.count+1) {
            if (position == 1) {
                this.addToStart(pet);
            }
            else
            {
                Node temp = head;
                int count = 1;
                while(temp != null)
                {
                    if(count == position -1)
                    {
                        Node newNode = new Node(pet);
                        newNode.setNext(temp.getNext());
                        temp.setNext(newNode);
                        this.count++;
                        break;
                    }
                    temp = temp.getNext();
                    count++;
                }

            }
        }
        else
        {
            throw new Exception("La posición no es válida");
        }
    }
    public void deleteToPosition(int position) throws Exception
    {
        if(position>0 && position <= this.count)
        {
            if (position==1)
            {
                this.head = this.head.getNext();
                this.count--;
            }
            else
            {
                Node temp = head;
                int count =1;
                while(temp != null)
                {
                    if(count == position -1)
                    {
                        temp.setNext(temp.getNext().getNext());
                        this.count--;
                        break;
                    }
                    temp = temp.getNext();
                    count++;
                }
            }
        }
        else
        {
            throw new Exception("La posición no es válida");
        }
    }

    public void invert()
    {
        if(this.head != null)
        {
            ListSE listcp = new ListSE();
            Node temp = this.head;
            while (temp != null)
            {
                listcp.addToStart(temp.getData());
                temp = temp.getNext();
            }
            this.head=listcp.getHead();

        }
    }

}




