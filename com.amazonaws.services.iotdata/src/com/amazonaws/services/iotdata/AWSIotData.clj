(ns com.amazonaws.services.iotdata.AWSIotData
  "Interface for accessing AWS IoT Data Plane.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIotData instead.


  AWS IoT

  AWS IoT-Data enables secure, bi-directional communication between Internet-connected things (such as sensors,
  actuators, embedded devices, or smart appliances) and the AWS cloud. It implements a broker for applications and
  things to publish messages over HTTP (Publish) and retrieve, update, and delete thing shadows. A thing shadow is a
  persistent representation of your things and their state in the AWS cloud."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotdata AWSIotData]))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"data.iot.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://data.iot.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSIotData this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSIotData this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn delete-thing-shadow
  "Deletes the thing shadow for the specified thing.


   For more information, see DeleteThingShadow in
   the AWS IoT Developer Guide.

  delete-thing-shadow-request - The input for the DeleteThingShadow operation. - `com.amazonaws.services.iotdata.model.DeleteThingShadowRequest`

  returns: Result of the DeleteThingShadow operation returned by the service. - `com.amazonaws.services.iotdata.model.DeleteThingShadowResult`

  throws: com.amazonaws.services.iotdata.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iotdata.model.DeleteThingShadowResult [^AWSIotData this ^com.amazonaws.services.iotdata.model.DeleteThingShadowRequest delete-thing-shadow-request]
    (-> this (.deleteThingShadow delete-thing-shadow-request))))

(defn get-thing-shadow
  "Gets the thing shadow for the specified thing.


   For more information, see GetThingShadow in the
   AWS IoT Developer Guide.

  get-thing-shadow-request - The input for the GetThingShadow operation. - `com.amazonaws.services.iotdata.model.GetThingShadowRequest`

  returns: Result of the GetThingShadow operation returned by the service. - `com.amazonaws.services.iotdata.model.GetThingShadowResult`

  throws: com.amazonaws.services.iotdata.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iotdata.model.GetThingShadowResult [^AWSIotData this ^com.amazonaws.services.iotdata.model.GetThingShadowRequest get-thing-shadow-request]
    (-> this (.getThingShadow get-thing-shadow-request))))

(defn publish
  "Publishes state information.


   For more information, see HTTP
   Protocol in the AWS IoT Developer Guide.

  publish-request - The input for the Publish operation. - `com.amazonaws.services.iotdata.model.PublishRequest`

  returns: Result of the Publish operation returned by the service. - `com.amazonaws.services.iotdata.model.PublishResult`

  throws: com.amazonaws.services.iotdata.model.InternalFailureException - An unexpected error has occurred."
  (^com.amazonaws.services.iotdata.model.PublishResult [^AWSIotData this ^com.amazonaws.services.iotdata.model.PublishRequest publish-request]
    (-> this (.publish publish-request))))

(defn update-thing-shadow
  "Updates the thing shadow for the specified thing.


   For more information, see UpdateThingShadow in
   the AWS IoT Developer Guide.

  update-thing-shadow-request - The input for the UpdateThingShadow operation. - `com.amazonaws.services.iotdata.model.UpdateThingShadowRequest`

  returns: Result of the UpdateThingShadow operation returned by the service. - `com.amazonaws.services.iotdata.model.UpdateThingShadowResult`

  throws: com.amazonaws.services.iotdata.model.RequestEntityTooLargeException - The payload exceeds the maximum size allowed."
  (^com.amazonaws.services.iotdata.model.UpdateThingShadowResult [^AWSIotData this ^com.amazonaws.services.iotdata.model.UpdateThingShadowRequest update-thing-shadow-request]
    (-> this (.updateThingShadow update-thing-shadow-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSIotData this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIotData this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

