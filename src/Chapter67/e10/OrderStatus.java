package Chapter67.e10;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public enum OrderStatus {
    PENDING, CONFIRMED, SHIPPED, DELIVERED, CANCELLED;

    boolean canTransitionTo(OrderStatus nextState){
        if(this == nextState){
            System.out.println("The current status is already " + nextState);
            return false;
        }

        return switch(this){
            case PENDING -> nextState == CONFIRMED || nextState == CANCELLED;
            case CONFIRMED -> nextState == SHIPPED || nextState == CANCELLED;
            case SHIPPED -> nextState == DELIVERED;
            default -> false;
        };
    }
}
