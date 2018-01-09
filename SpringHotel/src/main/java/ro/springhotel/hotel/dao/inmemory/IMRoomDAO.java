//package ro.springhotel.hotel.dao.inmemory;
//
//import org.springframework.util.StringUtils;
//import ro.springhotel.hotel.dao.RoomDAO;
//import ro.springhotel.hotel.domain.Client;
//import ro.springhotel.hotel.domain.Room;
//
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.LinkedList;
//
//public class IMRoomDAO extends IMBaseDAO<Room> implements RoomDAO {
//
//
//    @Override
//    public Collection<Room> searchByName(String query) {
//        if (StringUtils.isEmpty(query)) {
//            return getAll();
//        }
//
//        Collection<Room> all = new LinkedList<Room>(getAll());
//        for (Iterator<Room> it = all.iterator(); it.hasNext();) {
//            Room room = it.next();
//            long ss = room.getId();
//        }
//        return all;
//    }
//}



