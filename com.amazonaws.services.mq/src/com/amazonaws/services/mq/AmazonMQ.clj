(ns com.amazonaws.services.mq.AmazonMQ
  "Interface for accessing AmazonMQ.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonMQ instead.


  Amazon MQ is a managed message broker service for Apache ActiveMQ that makes it easy to set up and operate message
  brokers in the cloud. A message broker allows software applications and components to communicate using various
  programming languages, operating systems, and formal messaging protocols."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mq AmazonMQ]))

(defn delete-tags
  "Removes a tag from a resource.

  delete-tags-request - `com.amazonaws.services.mq.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.mq.model.DeleteTagsResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DeleteTagsResult [^AmazonMQ this ^com.amazonaws.services.mq.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTags delete-tags-request))))

(defn create-broker
  "Creates a broker. Note: This API is asynchronous.

  create-broker-request - Creates a broker using the specified properties. - `com.amazonaws.services.mq.model.CreateBrokerRequest`

  returns: Result of the CreateBroker operation returned by the service. - `com.amazonaws.services.mq.model.CreateBrokerResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.CreateBrokerResult [^AmazonMQ this ^com.amazonaws.services.mq.model.CreateBrokerRequest create-broker-request]
    (-> this (.createBroker create-broker-request))))

(defn describe-configuration-revision
  "Returns the specified configuration revision for the specified configuration.

  describe-configuration-revision-request - `com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest`

  returns: Result of the DescribeConfigurationRevision operation returned by the service. - `com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult [^AmazonMQ this ^com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest describe-configuration-revision-request]
    (-> this (.describeConfigurationRevision describe-configuration-revision-request))))

(defn describe-broker-engine-types
  "Describe available engine types and versions.

  describe-broker-engine-types-request - `com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest`

  returns: Result of the DescribeBrokerEngineTypes operation returned by the service. - `com.amazonaws.services.mq.model.DescribeBrokerEngineTypesResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeBrokerEngineTypesResult [^AmazonMQ this ^com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest describe-broker-engine-types-request]
    (-> this (.describeBrokerEngineTypes describe-broker-engine-types-request))))

(defn list-tags
  "Lists tags for a resource.

  list-tags-request - `com.amazonaws.services.mq.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.mq.model.ListTagsResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.ListTagsResult [^AmazonMQ this ^com.amazonaws.services.mq.model.ListTagsRequest list-tags-request]
    (-> this (.listTags list-tags-request))))

(defn update-user
  "Updates the information for an ActiveMQ user.

  update-user-request - Updates the information for an ActiveMQ user. - `com.amazonaws.services.mq.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.mq.model.UpdateUserResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.UpdateUserResult [^AmazonMQ this ^com.amazonaws.services.mq.model.UpdateUserRequest update-user-request]
    (-> this (.updateUser update-user-request))))

(defn list-brokers
  "Returns a list of all brokers.

  list-brokers-request - `com.amazonaws.services.mq.model.ListBrokersRequest`

  returns: Result of the ListBrokers operation returned by the service. - `com.amazonaws.services.mq.model.ListBrokersResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.ListBrokersResult [^AmazonMQ this ^com.amazonaws.services.mq.model.ListBrokersRequest list-brokers-request]
    (-> this (.listBrokers list-brokers-request))))

(defn list-configurations
  "Returns a list of all configurations.

  list-configurations-request - `com.amazonaws.services.mq.model.ListConfigurationsRequest`

  returns: Result of the ListConfigurations operation returned by the service. - `com.amazonaws.services.mq.model.ListConfigurationsResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.ListConfigurationsResult [^AmazonMQ this ^com.amazonaws.services.mq.model.ListConfigurationsRequest list-configurations-request]
    (-> this (.listConfigurations list-configurations-request))))

(defn describe-broker
  "Returns information about the specified broker.

  describe-broker-request - `com.amazonaws.services.mq.model.DescribeBrokerRequest`

  returns: Result of the DescribeBroker operation returned by the service. - `com.amazonaws.services.mq.model.DescribeBrokerResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeBrokerResult [^AmazonMQ this ^com.amazonaws.services.mq.model.DescribeBrokerRequest describe-broker-request]
    (-> this (.describeBroker describe-broker-request))))

(defn list-users
  "Returns a list of all ActiveMQ users.

  list-users-request - `com.amazonaws.services.mq.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.mq.model.ListUsersResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.ListUsersResult [^AmazonMQ this ^com.amazonaws.services.mq.model.ListUsersRequest list-users-request]
    (-> this (.listUsers list-users-request))))

(defn create-user
  "Creates an ActiveMQ user.

  create-user-request - Creates a new ActiveMQ user. - `com.amazonaws.services.mq.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.mq.model.CreateUserResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.CreateUserResult [^AmazonMQ this ^com.amazonaws.services.mq.model.CreateUserRequest create-user-request]
    (-> this (.createUser create-user-request))))

(defn delete-broker
  "Deletes a broker. Note: This API is asynchronous.

  delete-broker-request - `com.amazonaws.services.mq.model.DeleteBrokerRequest`

  returns: Result of the DeleteBroker operation returned by the service. - `com.amazonaws.services.mq.model.DeleteBrokerResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DeleteBrokerResult [^AmazonMQ this ^com.amazonaws.services.mq.model.DeleteBrokerRequest delete-broker-request]
    (-> this (.deleteBroker delete-broker-request))))

(defn delete-user
  "Deletes an ActiveMQ user.

  delete-user-request - `com.amazonaws.services.mq.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.mq.model.DeleteUserResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DeleteUserResult [^AmazonMQ this ^com.amazonaws.services.mq.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUser delete-user-request))))

(defn describe-configuration
  "Returns information about the specified configuration.

  describe-configuration-request - `com.amazonaws.services.mq.model.DescribeConfigurationRequest`

  returns: Result of the DescribeConfiguration operation returned by the service. - `com.amazonaws.services.mq.model.DescribeConfigurationResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeConfigurationResult [^AmazonMQ this ^com.amazonaws.services.mq.model.DescribeConfigurationRequest describe-configuration-request]
    (-> this (.describeConfiguration describe-configuration-request))))

(defn create-tags
  "Add a tag to a resource.

  create-tags-request - A map of the key-value pairs for the resource tag. - `com.amazonaws.services.mq.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.mq.model.CreateTagsResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.CreateTagsResult [^AmazonMQ this ^com.amazonaws.services.mq.model.CreateTagsRequest create-tags-request]
    (-> this (.createTags create-tags-request))))

(defn update-broker
  "Adds a pending configuration change to a broker.

  update-broker-request - Updates the broker using the specified properties. - `com.amazonaws.services.mq.model.UpdateBrokerRequest`

  returns: Result of the UpdateBroker operation returned by the service. - `com.amazonaws.services.mq.model.UpdateBrokerResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.UpdateBrokerResult [^AmazonMQ this ^com.amazonaws.services.mq.model.UpdateBrokerRequest update-broker-request]
    (-> this (.updateBroker update-broker-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonMQ this]
    (-> this (.shutdown))))

(defn reboot-broker
  "Reboots a broker. Note: This API is asynchronous.

  reboot-broker-request - `com.amazonaws.services.mq.model.RebootBrokerRequest`

  returns: Result of the RebootBroker operation returned by the service. - `com.amazonaws.services.mq.model.RebootBrokerResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.RebootBrokerResult [^AmazonMQ this ^com.amazonaws.services.mq.model.RebootBrokerRequest reboot-broker-request]
    (-> this (.rebootBroker reboot-broker-request))))

(defn describe-broker-instance-options
  "Describe available broker instance options.

  describe-broker-instance-options-request - `com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest`

  returns: Result of the DescribeBrokerInstanceOptions operation returned by the service. - `com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsResult [^AmazonMQ this ^com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest describe-broker-instance-options-request]
    (-> this (.describeBrokerInstanceOptions describe-broker-instance-options-request))))

(defn describe-user
  "Returns information about an ActiveMQ user.

  describe-user-request - `com.amazonaws.services.mq.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.mq.model.DescribeUserResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.DescribeUserResult [^AmazonMQ this ^com.amazonaws.services.mq.model.DescribeUserRequest describe-user-request]
    (-> this (.describeUser describe-user-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonMQ this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-configuration
  "Updates the specified configuration.

  update-configuration-request - Updates the specified configuration. - `com.amazonaws.services.mq.model.UpdateConfigurationRequest`

  returns: Result of the UpdateConfiguration operation returned by the service. - `com.amazonaws.services.mq.model.UpdateConfigurationResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.UpdateConfigurationResult [^AmazonMQ this ^com.amazonaws.services.mq.model.UpdateConfigurationRequest update-configuration-request]
    (-> this (.updateConfiguration update-configuration-request))))

(defn list-configuration-revisions
  "Returns a list of all revisions for the specified configuration.

  list-configuration-revisions-request - `com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest`

  returns: Result of the ListConfigurationRevisions operation returned by the service. - `com.amazonaws.services.mq.model.ListConfigurationRevisionsResult`

  throws: com.amazonaws.services.mq.model.NotFoundException - HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.ListConfigurationRevisionsResult [^AmazonMQ this ^com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest list-configuration-revisions-request]
    (-> this (.listConfigurationRevisions list-configuration-revisions-request))))

(defn create-configuration
  "Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the
   engine type and version).

  create-configuration-request - Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version). - `com.amazonaws.services.mq.model.CreateConfigurationRequest`

  returns: Result of the CreateConfiguration operation returned by the service. - `com.amazonaws.services.mq.model.CreateConfigurationResult`

  throws: com.amazonaws.services.mq.model.BadRequestException - HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it."
  (^com.amazonaws.services.mq.model.CreateConfigurationResult [^AmazonMQ this ^com.amazonaws.services.mq.model.CreateConfigurationRequest create-configuration-request]
    (-> this (.createConfiguration create-configuration-request))))

