/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestream;

/**
 *
 * @author Student
 */
public abstract class ShapeDecorator implements Shape{
    Shape shape;
    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    
    @Override
    public void draw() {
        shape.draw();
    }
    
    
}
