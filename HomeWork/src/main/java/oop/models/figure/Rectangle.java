package oop.models.figure;

import lombok.*;
import oop.Example;
import oop.models.figure.enums.Colors;
import oop.models.figure.enums.Names;
import oop.repositories.Figure2D;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Rectangle implements Figure2D {

   private int weight;
   private int height;
   private Names name;
   private Colors color;

   @Override
   public void draw(Names name) {
       System.out.println("Фигура:"+ this.name);
    }
   @Override
   public double square() {
        return weight*height;
    }

}
