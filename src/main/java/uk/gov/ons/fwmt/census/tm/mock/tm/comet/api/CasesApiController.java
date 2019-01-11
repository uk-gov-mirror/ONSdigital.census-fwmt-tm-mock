package uk.gov.ons.fwmt.census.tm.mock.tm.comet.api;

import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import uk.gov.ons.fwmt.census.tm.mock.logging.MockLogger;
import uk.gov.ons.fwmt.census.tm.mock.tm.comet.model.FetchResponseCase;
import uk.gov.ons.fwmt.census.tm.mock.tm.comet.model.ModelCase;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-07T11:49:58.389925Z[Europe/London]")

@Controller
public class CasesApiController implements CasesApi {

  private static final Logger log = LoggerFactory.getLogger(CasesApiController.class);

  private MockLogger mockLogger;

  private final HttpServletRequest request;

  @Autowired
  public CasesApiController(MockLogger mockLogger, HttpServletRequest request) {
    this.mockLogger = mockLogger;
    this.request = request;
  }

  public ResponseEntity<ModelCase> casesByIdGet(
      @ApiParam(value = "Unique Id for Visit", required = true) @PathVariable("id") String id) {
    mockLogger.logEndpoint("CasesApiController", "casesByIdGet");
    String accept = request.getHeader("Accept");
    // TODO implement this?
    return new ResponseEntity<ModelCase>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Void> casesByIdPost(
      @ApiParam(value = "Identifier.", required = true) @PathVariable("id") String id,
      @ApiParam(value = "Case object.") @Valid @RequestBody ModelCase body) {
    mockLogger.logEndpoint("CasesApiController", "casesByIdPost");
    String accept = request.getHeader("Accept");
    log.info("Job Recreived: " + body.getId() + ", accept: " + accept);
    return new ResponseEntity<Void>(HttpStatus.OK);
  }

  public ResponseEntity<FetchResponseCase> casesGet(
      @ApiParam(value = "Specify any filter criteria to limit the results returned. Each filter is a name:value pair separated by the :: delimiter.</br>           By default no filtering is applied to the results.           The supported filters are - Id, Reference, CaseType, State, Category, EstabType, CoordCode, Contact, Address, Location, Htc, Priority, Description, SpecialInstructions, HoldUntil.         ")
      @Valid @RequestParam(value = "filter", required = false) String filter,
      @ApiParam(value = "Specify the zero based page number to be returned. If not specified the first page is returned.")
      @Valid @RequestParam(value = "pageNo", required = false) Integer pageNo,
      @ApiParam(value = "Specify the maximum number of results to return per request.")
      @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize) {
    mockLogger.logEndpoint("CasesApiController", "casesGet");
    String accept = request.getHeader("Accept");
    // TODO implement this?
    return new ResponseEntity<FetchResponseCase>(HttpStatus.NOT_IMPLEMENTED);
  }
}
