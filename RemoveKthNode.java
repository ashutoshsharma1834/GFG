int count=0;
Node temp=head;
int flag=k;
if(k==1) return null;
while(temp!=null && temp.next!=null){
    count++;
    if(count==(k-1)){
        k+=flag;
        temp.next=temp.next.next;
        count++;
    }
    temp=temp.next;
}

return head;