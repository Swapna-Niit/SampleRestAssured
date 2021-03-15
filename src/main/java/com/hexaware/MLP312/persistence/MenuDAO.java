package com.hexaware.MLP312.persistence;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP312.model.Menu;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface MenuDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Menu")
    @Mapper(MenuMapper.class)
    List<Menu> show();
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Menu where FOOD_ID = :fid")
  @Mapper(MenuMapper.class)
  Menu selectMenu(@Bind("fid") int fid);
}
