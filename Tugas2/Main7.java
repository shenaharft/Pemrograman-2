/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.stmikamik;

/**
 *
 * @author user-4
 */
public class Main7 {
    public static void main(String[] args) {
        circle7 g = new circle7(12, "helm");
        System.out.println("nama benda: " +g.getName());
        System.out.println("radius: " +g.getRadius());
        System.out.println("luas: " +g.getArea());
        
       rectangle7 t = new rectangle7("kardus", 6,3);
        System.out.println("nama benda: " +t.getName());
        System.out.println("panjang: " +t.getLength());
        System.out.println("lebar: " +t.getWidth());
        System.out.println("luas: " +t.getArea());
    }
    
}
