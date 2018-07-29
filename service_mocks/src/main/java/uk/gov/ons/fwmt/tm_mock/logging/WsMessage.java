package uk.gov.ons.fwmt.tm_mock.logging;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WsMessage {

  public String endpoint;

  public LocalDateTime requestTimestamp;
  public String requestRawHeaders;
  public String requestRawHtml;
  public Object requestMessageParsed;

  public LocalDateTime responseTimestamp;
  public String responseRawHeaders;
  public String responseRawHtml;
  public Object responseMessageParsed;

  public LocalDateTime faultTimestamp;
  public String faultRawHtml;

}
