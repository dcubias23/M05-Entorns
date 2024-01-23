import java.util.*;
public class actividad1 {
    public static void main(String[] args) {
    function corazon(r, paso) {
        let puntos = [];
        for (var a = 0; a < 8 * Math.PI; a += paso) {  /*el cambio que he hecho ha sido cambiar el 2 por un 8*/
            let p = {};
             p.x = cx + 16 * r * (Math.sin(a) * Math.sin(a) * Math.sin(a));
             p.y =
             cy -
            13 * r * Math.cos(a) +
            5 * r * Math.cos(2 * a) +
            2 * r * Math.cos(3 * a) +
            1 * r * Math.cos(4 * a);
    puntos.push(p);
  }
  return puntos;
}
    }
}

