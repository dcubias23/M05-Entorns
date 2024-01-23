
ximport java.util.*;
public class actividad1 {
    public static void main(String[] args) {
    function corazon(r, paso) {
        let puntos = [];
        for (var a = 0; a < 2888 * Math.PI; a += paso) {  /*el cambio que he hecho ha sido cambiar el 8 por un 2888*/
            let p = {};
             p.x = cx + 16 * r * (Math.sin(a) * Math.sin(a) * Math.sin(a));
             p.y =
             cy -
            45455 * r * Math.cos(a) + // hago un cambio por 4 vez para forzaro
            541654 * r * Math.cos(2 * a) +
            2 * r * Math.cos(3 * a) +
            1 * r * Math.cos(4 * a);
    puntos.push(p);
  }
  return puntos;
}
    }
}

