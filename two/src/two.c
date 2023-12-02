#include<iostream>
#include<stdlib.h>
#define MAX 5
using namespace std;
template <class T>
class Queue
{
T Q[MAX],front=-1,rear=-1;
public:
	int isFull();
	int isEmpty();
	void insertion(T);
	void deletion(T);
	void display();
};
template <class T>
int Queue<T>::isFull()
{
if(rear==MAX-1)
{
return 1;
}
else
return 0;
}
template <class T>
int Queue<T>::isEmpty()
{
if(front==-1)
{
return 1;
}
else
return 0;
}
template <class T>
void Queue<T>::insertion (T value)
{
if(isFull())
{
cout<<"Queue overflow...";
}
 else if(isEmpty())
{
rear=0;
front=0;
Q [rear]=value;
cout<<"value inserted:"<<value;
}
else
{
rear ++;
Q [rear]=value;
cout<<"value inserted:"<<value;
}
}
template <class T>
void Queue <T>::deletion (T value)
{
if(isEmpty ())
{
cout<<"Queue underflow...";
}
else
{
if(front==rear)
{
value=Q[front];
front=rear=-1;
cout<<"value deleted:"<<value;
}
else
{
value=Q[front];
front ++;
cout<<"value deleted:"<<value;
}
}
}
template <class T>
void Queue<T>::display()
{
if(isEmpty())
{
cout<<"Queue is Empty...";
}
else
{
cout<<"Queue values:";
for(int i=front;i<=rear;i++)
{
cout<<Q[i]<<" ";
}
cout<<endl;
}
}
int main()
{
Queue <int>q;
int ch,value;
while(1)
{
cout<<"\n menu \n 1.insertion \n 2.Deletion \n 3.Display Queue \n 4.Exit"<<endl;
cout<<"Enter choice:"<<endl;
cin>>ch;
switch(ch)
{
case 1:
cout<<"inserting element:";
cin>>value;
q.insertion(value);
break;
case 2:
q.deletion(value);
break;
case 3:
q.display();
break;
case 4:
exit (0);
break;
default:
cout<<"invalid choice...";
}
}
return 0;
}
