(ns com.amazonaws.services.health.AWSHealthAsyncClient
  "Client for accessing AWSHealth asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  AWS Health

  The AWS Health API provides programmatic access to the AWS Health information that is presented in the AWS Personal Health Dashboard. You can get information about events
  that affect your AWS resources:




  DescribeEvents: Summary information about events.




  DescribeEventDetails: Detailed information about one or more events.




  DescribeAffectedEntities: Information about AWS resources that are affected by one or more events.




  In addition, these operations provide information about event types and summary counts of events or affected
  entities:




  DescribeEventTypes: Information about the kinds of events that AWS Health tracks.




  DescribeEventAggregates: A count of the number of events that meet specified criteria.




  DescribeEntityAggregates: A count of the number of affected entities that meet specified criteria.




  The Health API requires a Business or Enterprise support plan from AWS Support. Calling the Health API from an account that does not
  have a Business or Enterprise support plan causes a SubscriptionRequiredException.


  For authentication of requests, AWS Health uses the Signature Version 4 Signing
  Process.


  See the AWS Health User Guide for
  information about how to use the API.


  Service Endpoint


  The HTTP endpoint for the AWS Health API is:




  https://health.us-east-1.amazonaws.com"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.health AWSHealthAsyncClient]))

(defn ->aws-health-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSHealthAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSHealthAsyncClient aws-credentials client-configuration executor-service))
  (^AWSHealthAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSHealthAsyncClient aws-credentials executor-service))
  (^AWSHealthAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSHealthAsyncClient client-configuration))
  (^AWSHealthAsyncClient []
    (new AWSHealthAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.health.AWSHealthAsyncClientBuilder`"
  (^com.amazonaws.services.health.AWSHealthAsyncClientBuilder []
    (AWSHealthAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSHealthAsyncClient this]
    (-> this (.getExecutorService))))

(defn describe-affected-entities-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAffectedEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeAffectedEntitiesResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAffectedEntitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest request]
    (-> this (.describeAffectedEntitiesAsync request))))

(defn describe-entity-aggregates-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeEntityAggregatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEntityAggregates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEntityAggregatesResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeEntityAggregatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEntityAggregatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeEntityAggregatesRequest request]
    (-> this (.describeEntityAggregatesAsync request))))

(defn describe-event-aggregates-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeEventAggregatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventAggregates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventAggregatesResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeEventAggregatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventAggregatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeEventAggregatesRequest request]
    (-> this (.describeEventAggregatesAsync request))))

(defn describe-event-details-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeEventDetailsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventDetailsResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeEventDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeEventDetailsRequest request]
    (-> this (.describeEventDetailsAsync request))))

(defn describe-event-types-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeEventTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventTypesResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeEventTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeEventTypesRequest request]
    (-> this (.describeEventTypesAsync request))))

(defn describe-events-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsyncClient this ^com.amazonaws.services.health.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSHealthAsyncClient this]
    (-> this (.shutdown))))

