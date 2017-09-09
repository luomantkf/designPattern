package com.pattern.iterator;

/**
 * Created by Administrator on 2017/7/14.
 */
public class AggregateImp implements Aggregate{

    private String[] elementDate=new String[20];
    private int size;

    @Override
    public Iterator createIterator() {
        return new IteratorImp();
    }

    public void setDate(String str){
        elementDate[size++]=str;
    }
    public int getSize(){
        return size;
    }
    private class IteratorImp implements Iterator{

        private int currentIndex;

        @Override
        public Object first() {
            return elementDate[0];
        }

        @Override
        public Object next() {
            if(currentIndex<size){
                return elementDate[currentIndex++];
            }else{
                return null;
            }

        }

        @Override
        public Object last() {
            return elementDate[size-1];
        }

        @Override
        public boolean isDone() {
            if(currentIndex<size){
                return false;
            }else {
                return true;
            }
        }

        @Override
        public Object currentItem() {
            return elementDate[currentIndex];
        }
    }
}
