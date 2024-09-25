package io.camunda.devrel.connectors;

import io.camunda.connector.api.annotation.OutboundConnector;
import io.camunda.connector.api.error.ConnectorException;
import io.camunda.connector.api.outbound.OutboundConnectorContext;
import io.camunda.connector.api.outbound.OutboundConnectorFunction;
import io.camunda.connector.generator.java.annotation.ElementTemplate;
import io.camunda.devrel.connectors.Model.Query;
import io.camunda.devrel.connectors.dto.MyConnectorRequest;
import io.camunda.devrel.connectors.dto.MyConnectorResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@OutboundConnector(
    name = "Marvel API Connector",
    inputVariables = {"authentication", "message"},
    type = "io.camunda:template:1")
@ElementTemplate(
    id = "io.camunda.devrel.connectors.MarvelApi.v1",
    name = "Marvel API Connector",
    version = 1,
    description = "Fetches data from the Marvel API",
    icon = "icon.svg",
    documentationRef = "https://github.com/nloding/camunda-8-marvel-api-connector/README.md",
    propertyGroups = {
//      @ElementTemplate.PropertyGroup(id = "authentication", label = "Authentication"),
      @ElementTemplate.PropertyGroup(id = "query", label = "Type of Query"),
      @ElementTemplate.PropertyGroup(id = "operation", label = "Operation"),
      @ElementTemplate.PropertyGroup(id = "orderBy", label = "Order By"),
      @ElementTemplate.PropertyGroup(id = "pagination", label = "Pagination")
    },
    inputDataClass = Query.class)
public class MarvelApiConnector implements OutboundConnectorFunction {

  private static final Logger LOGGER = LoggerFactory.getLogger(MarvelApiConnector.class);

  @Override
  public Object execute(OutboundConnectorContext context) {
    final var connectorRequest = context.bindVariables(Query.class);
    return executeConnector(connectorRequest);
  }

  private MyConnectorResult executeConnector(final Query connectorRequest) {
    // TODO: implement connector logic
    LOGGER.info("Executing my connector with request {}", connectorRequest);
    String message = "fail";
    if (message != null && message.toLowerCase().startsWith("fail")) {
      throw new ConnectorException("FAIL", "My property started with 'fail', was: " + message);
    }
    return new MyConnectorResult("Message received: " + message);
  }
}
