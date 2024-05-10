package ruan.nunes;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/my-entity")
public class MyEntityResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get() {
        return "Hello from RESTEasy Reactive";
    }

    public void doSomething() {
          MyEntity entity1 = new MyEntity();
          entity1.field = "field-1";
          entity1.persist();

          List<MyEntity> entities = MyEntity.listAll();
    }
}
