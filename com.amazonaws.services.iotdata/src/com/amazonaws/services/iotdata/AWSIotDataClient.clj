(ns com.amazonaws.services.iotdata.AWSIotDataClient
  "Client for accessing AWS IoT Data Plane. All service calls made using this client are blocking, and will not return
  until the service call completes.

  AWS IoT

  AWS IoT-Data enables secure, bi-directional communication between Internet-connected things (such as sensors,
  actuators, embedded devices, or smart appliances) and the AWS cloud. It implements a broker for applications and
  things to publish messages over HTTP (Publish) and retrieve, update, and delete thing shadows. A thing shadow is a
  persistent representation of your things and their state in the AWS cloud."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotdata AWSIotDataClient]))

(defn ->aws-iot-data-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS IoT Data Plane (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSIotDataClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSIotDataClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSIotDataClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSIotDataClient aws-credentials client-configuration))
  (^AWSIotDataClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSIotDataClient client-configuration))
  (^AWSIotDataClient []
    (new AWSIotDataClient )))

(defn *builder
  "returns: `com.amazonaws.services.iotdata.AWSIotDataClientBuilder`"
  (^com.amazonaws.services.iotdata.AWSIotDataClientBuilder []
    (AWSIotDataClient/builder )))

(defn delete-thing-shadow
  "Deletes the thing shadow for the specified thing.


   For more information, see DeleteThingShadow in
   the AWS IoT Developer Guide.

  request - `com.amazonaws.services.iotdata.model.DeleteThingShadowRequest`

  returns: Result of the DeleteThingShadow operation returned by the service. - `com.amazonaws.services.iotdata.model.DeleteThingShadowResult`

  throws: com.amazonaws.services.iotdata.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iotdata.model.DeleteThingShadowResult [^AWSIotDataClient this ^com.amazonaws.services.iotdata.model.DeleteThingShadowRequest request]
    (-> this (.deleteThingShadow request))))

(defn get-thing-shadow
  "Gets the thing shadow for the specified thing.


   For more information, see GetThingShadow in the
   AWS IoT Developer Guide.

  request - `com.amazonaws.services.iotdata.model.GetThingShadowRequest`

  returns: Result of the GetThingShadow operation returned by the service. - `com.amazonaws.services.iotdata.model.GetThingShadowResult`

  throws: com.amazonaws.services.iotdata.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iotdata.model.GetThingShadowResult [^AWSIotDataClient this ^com.amazonaws.services.iotdata.model.GetThingShadowRequest request]
    (-> this (.getThingShadow request))))

(defn publish
  "Publishes state information.


   For more information, see HTTP
   Protocol in the AWS IoT Developer Guide.

  request - `com.amazonaws.services.iotdata.model.PublishRequest`

  returns: Result of the Publish operation returned by the service. - `com.amazonaws.services.iotdata.model.PublishResult`

  throws: com.amazonaws.services.iotdata.model.InternalFailureException - An unexpected error has occurred."
  (^com.amazonaws.services.iotdata.model.PublishResult [^AWSIotDataClient this ^com.amazonaws.services.iotdata.model.PublishRequest request]
    (-> this (.publish request))))

(defn update-thing-shadow
  "Updates the thing shadow for the specified thing.


   For more information, see UpdateThingShadow in
   the AWS IoT Developer Guide.

  request - `com.amazonaws.services.iotdata.model.UpdateThingShadowRequest`

  returns: Result of the UpdateThingShadow operation returned by the service. - `com.amazonaws.services.iotdata.model.UpdateThingShadowResult`

  throws: com.amazonaws.services.iotdata.model.RequestEntityTooLargeException - The payload exceeds the maximum size allowed."
  (^com.amazonaws.services.iotdata.model.UpdateThingShadowResult [^AWSIotDataClient this ^com.amazonaws.services.iotdata.model.UpdateThingShadowRequest request]
    (-> this (.updateThingShadow request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIotDataClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

