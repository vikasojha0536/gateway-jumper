package jumper.model.request;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutgoingRequest extends Request {

  private Map<String, String> zuulHeader;
}
