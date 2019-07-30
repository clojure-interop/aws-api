(ns com.amazonaws.services.mq.AmazonMQClient
  "Client for accessing AmazonMQ. All service calls made using this client are blocking, and will not return until the
  service call completes.

  Amazon MQ is a managed message broker service for Apache ActiveMQ that makes it easy to set up and operate message
  brokers in the cloud. A message broker allows software applications and components to communicate using various
  programming languages, operating systems, and formal messaging protocols."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mq AmazonMQClient]))

(defn *builder
  "returns: `com.amazonaws.services.mq.AmazonMQClientBuilder`"
  (^com.amazonaws.services.mq.AmazonMQClientBuilder []
    (AmazonMQClient/builder )))

(defn delete-tags
  "Removes a tag from a resource.

  request - `com.amazonaws.services.mq.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.mq.model.DeleteTagsResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DeleteTagsResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn create-broker
  "Creates a broker. Note: This API is asynchronous.

  request - `com.amazonaws.services.mq.model.CreateBrokerRequest`

  returns: Result of the CreateBroker operation returned by the service. - `com.amazonaws.services.mq.model.CreateBrokerResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.CreateBrokerResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.CreateBrokerRequest request]
    (-> this (.createBroker request))))

(defn describe-configuration-revision
  "Returns the specified configuration revision for the specified configuration.

  request - `com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest`

  returns: Result of the DescribeConfigurationRevision operation returned by the service. - `com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest request]
    (-> this (.describeConfigurationRevision request))))

(defn describe-broker-engine-types
  "Describe available engine types and versions.

  request - `com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest`

  returns: Result of the DescribeBrokerEngineTypes operation returned by the service. - `com.amazonaws.services.mq.model.DescribeBrokerEngineTypesResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeBrokerEngineTypesResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest request]
    (-> this (.describeBrokerEngineTypes request))))

(defn list-tags
  "Lists tags for a resource.

  request - `com.amazonaws.services.mq.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.mq.model.ListTagsResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.ListTagsResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn update-user
  "Updates the information for an ActiveMQ user.

  request - `com.amazonaws.services.mq.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.mq.model.UpdateUserResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.UpdateUserResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.UpdateUserRequest request]
    (-> this (.updateUser request))))

(defn list-brokers
  "Returns a list of all brokers.

  request - `com.amazonaws.services.mq.model.ListBrokersRequest`

  returns: Result of the ListBrokers operation returned by the service. - `com.amazonaws.services.mq.model.ListBrokersResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.ListBrokersResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.ListBrokersRequest request]
    (-> this (.listBrokers request))))

(defn list-configurations
  "Returns a list of all configurations.

  request - `com.amazonaws.services.mq.model.ListConfigurationsRequest`

  returns: Result of the ListConfigurations operation returned by the service. - `com.amazonaws.services.mq.model.ListConfigurationsResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.ListConfigurationsResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.ListConfigurationsRequest request]
    (-> this (.listConfigurations request))))

(defn describe-broker
  "Returns information about the specified broker.

  request - `com.amazonaws.services.mq.model.DescribeBrokerRequest`

  returns: Result of the DescribeBroker operation returned by the service. - `com.amazonaws.services.mq.model.DescribeBrokerResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeBrokerResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.DescribeBrokerRequest request]
    (-> this (.describeBroker request))))

(defn list-users
  "Returns a list of all ActiveMQ users.

  request - `com.amazonaws.services.mq.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.mq.model.ListUsersResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.ListUsersResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn create-user
  "Creates an ActiveMQ user.

  request - `com.amazonaws.services.mq.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.mq.model.CreateUserResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.CreateUserResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn delete-broker
  "Deletes a broker. Note: This API is asynchronous.

  request - `com.amazonaws.services.mq.model.DeleteBrokerRequest`

  returns: Result of the DeleteBroker operation returned by the service. - `com.amazonaws.services.mq.model.DeleteBrokerResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DeleteBrokerResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.DeleteBrokerRequest request]
    (-> this (.deleteBroker request))))

(defn delete-user
  "Deletes an ActiveMQ user.

  request - `com.amazonaws.services.mq.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.mq.model.DeleteUserResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DeleteUserResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn describe-configuration
  "Returns information about the specified configuration.

  request - `com.amazonaws.services.mq.model.DescribeConfigurationRequest`

  returns: Result of the DescribeConfiguration operation returned by the service. - `com.amazonaws.services.mq.model.DescribeConfigurationResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeConfigurationResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.DescribeConfigurationRequest request]
    (-> this (.describeConfiguration request))))

(defn create-tags
  "Add a tag to a resource.

  request - `com.amazonaws.services.mq.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.mq.model.CreateTagsResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.CreateTagsResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn update-broker
  "Adds a pending configuration change to a broker.

  request - `com.amazonaws.services.mq.model.UpdateBrokerRequest`

  returns: Result of the UpdateBroker operation returned by the service. - `com.amazonaws.services.mq.model.UpdateBrokerResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.UpdateBrokerResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.UpdateBrokerRequest request]
    (-> this (.updateBroker request))))

(defn reboot-broker
  "Reboots a broker. Note: This API is asynchronous.

  request - `com.amazonaws.services.mq.model.RebootBrokerRequest`

  returns: Result of the RebootBroker operation returned by the service. - `com.amazonaws.services.mq.model.RebootBrokerResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.RebootBrokerResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.RebootBrokerRequest request]
    (-> this (.rebootBroker request))))

(defn describe-broker-instance-options
  "Describe available broker instance options.

  request - `com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest`

  returns: Result of the DescribeBrokerInstanceOptions operation returned by the service. - `com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest request]
    (-> this (.describeBrokerInstanceOptions request))))

(defn describe-user
  "Returns information about an ActiveMQ user.

  request - `com.amazonaws.services.mq.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.mq.model.DescribeUserResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeUserResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.DescribeUserRequest request]
    (-> this (.describeUser request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonMQClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-configuration
  "Updates the specified configuration.

  request - `com.amazonaws.services.mq.model.UpdateConfigurationRequest`

  returns: Result of the UpdateConfiguration operation returned by the service. - `com.amazonaws.services.mq.model.UpdateConfigurationResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.UpdateConfigurationResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.UpdateConfigurationRequest request]
    (-> this (.updateConfiguration request))))

(defn list-configuration-revisions
  "Returns a list of all revisions for the specified configuration.

  request - `com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest`

  returns: Result of the ListConfigurationRevisions operation returned by the service. - `com.amazonaws.services.mq.model.ListConfigurationRevisionsResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.ListConfigurationRevisionsResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest request]
    (-> this (.listConfigurationRevisions request))))

(defn create-configuration
  "Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the
   engine type and version).

  request - `com.amazonaws.services.mq.model.CreateConfigurationRequest`

  returns: Result of the CreateConfiguration operation returned by the service. - `com.amazonaws.services.mq.model.CreateConfigurationResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.CreateConfigurationResult [^AmazonMQClient this ^com.amazonaws.services.mq.model.CreateConfigurationRequest request]
    (-> this (.createConfiguration request))))

