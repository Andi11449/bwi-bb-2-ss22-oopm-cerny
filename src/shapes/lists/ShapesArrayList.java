package shapes.lists;

import shapes.entities.Shape;

public class ShapesArrayList implements ShapesList{
    private Shape[] data;
    private int nextIdx;

    public ShapesArrayList() {
        data = new Shape[4];
        nextIdx = 0;
    }

    public void add(Shape s) {
        ensureCapacity(nextIdx);
        // if (nextIdx >= data.length)
        //    ensureCapacity(data.length*2);

        data[nextIdx] = s;
        nextIdx++;
    }

    public void remove(int idx){
        for (int i = idx; i < nextIdx-1; i++) {
            data[i] = data[i+1];
        }

        nextIdx--;
    }

    private void ensureCapacity(int length) {
        if(length >= data.length) {
            Shape[] newData = new Shape[length*2];
            for (int i = 0; i < nextIdx; i++) {
                newData[i] = data[i];
            }

            data = newData;
        }
    }

    public Shape get(int idx) {
        if(idx < 0 || idx >= nextIdx)
            return null;
        return data[idx];
    }

    public int length(){
        return nextIdx;
    }
}
