package com.company.lab111.labwork3;

public class main3 {

    public static void main(String[] args){
        Component people = new Composite("человечек");
        Component head1 = new Composite("голова");
        Component ear1 = new Leaf("ухо1",4,5,6,7 );
        Component ear2 = new Leaf("ухо2",7,8,6,7 );
        Component head = new Leaf("голова без ушей",5,7,5,7);
        Component arm1 = new Leaf("рука1",1,4,3,4 );
        Component arm2 = new Leaf("рука2",8,11,3,4 );
        Component stomach = new Leaf("живот",4,8,2,5);
        Component leg1 = new Leaf("нога1",3,6,0,2 );
        Component leg2 = new Leaf("нога2",6,9,0,2);
        head1.add(ear1);
        head1.add(ear2);
        head1.add(head);
        people.add(head1);
        people.add(arm1);
        people.add(arm2);
        people.add(stomach);
        people.add(leg1);
        people.add(leg2);
        people.display();
        people.remove(arm1);
        people.display();
        head = new SizeDecorator(head);
        head.SetManipulator();
        head = new PositionDecorator(head);
        head.SetManipulator();
        head1 = new SizeDecorator(head1);
        head1.SetManipulator();
        head1 = new PositionDecorator(head1);
        head1.SetManipulator();
        people = new SizeDecorator(people);
        people.SetManipulator();
        Component ne = new Composite("mml");
        head1.add(ne);
        people.display();
        head1.remove(ne);
        people.display();
    }
}
