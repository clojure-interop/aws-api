(ns com.amazonaws.services.mq.AbstractAmazonMQ
  "Abstract implementation of AmazonMQ. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mq AbstractAmazonMQ]))

(defn delete-tags
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.mq.model.DeleteTagsResult`"
  (^com.amazonaws.services.mq.model.DeleteTagsResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn create-broker
  "Description copied from interface: AmazonMQ

  request - Creates a broker using the specified properties. - `com.amazonaws.services.mq.model.CreateBrokerRequest`

  returns: Result of the CreateBroker operation returned by the service. - `com.amazonaws.services.mq.model.CreateBrokerResult`"
  (^com.amazonaws.services.mq.model.CreateBrokerResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.CreateBrokerRequest request]
    (-> this (.createBroker request))))

(defn describe-configuration-revision
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest`

  returns: Result of the DescribeConfigurationRevision operation returned by the service. - `com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult`"
  (^com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest request]
    (-> this (.describeConfigurationRevision request))))

(defn describe-broker-engine-types
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest`

  returns: Result of the DescribeBrokerEngineTypes operation returned by the service. - `com.amazonaws.services.mq.model.DescribeBrokerEngineTypesResult`"
  (^com.amazonaws.services.mq.model.DescribeBrokerEngineTypesResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest request]
    (-> this (.describeBrokerEngineTypes request))))

(defn list-tags
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.mq.model.ListTagsResult`"
  (^com.amazonaws.services.mq.model.ListTagsResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn update-user
  "Description copied from interface: AmazonMQ

  request - Updates the information for an ActiveMQ user. - `com.amazonaws.services.mq.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.mq.model.UpdateUserResult`"
  (^com.amazonaws.services.mq.model.UpdateUserResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.UpdateUserRequest request]
    (-> this (.updateUser request))))

(defn list-brokers
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.ListBrokersRequest`

  returns: Result of the ListBrokers operation returned by the service. - `com.amazonaws.services.mq.model.ListBrokersResult`"
  (^com.amazonaws.services.mq.model.ListBrokersResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.ListBrokersRequest request]
    (-> this (.listBrokers request))))

(defn list-configurations
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.ListConfigurationsRequest`

  returns: Result of the ListConfigurations operation returned by the service. - `com.amazonaws.services.mq.model.ListConfigurationsResult`"
  (^com.amazonaws.services.mq.model.ListConfigurationsResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.ListConfigurationsRequest request]
    (-> this (.listConfigurations request))))

(defn describe-broker
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.DescribeBrokerRequest`

  returns: Result of the DescribeBroker operation returned by the service. - `com.amazonaws.services.mq.model.DescribeBrokerResult`"
  (^com.amazonaws.services.mq.model.DescribeBrokerResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.DescribeBrokerRequest request]
    (-> this (.describeBroker request))))

(defn list-users
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.mq.model.ListUsersResult`"
  (^com.amazonaws.services.mq.model.ListUsersResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn create-user
  "Description copied from interface: AmazonMQ

  request - Creates a new ActiveMQ user. - `com.amazonaws.services.mq.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.mq.model.CreateUserResult`"
  (^com.amazonaws.services.mq.model.CreateUserResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn delete-broker
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.DeleteBrokerRequest`

  returns: Result of the DeleteBroker operation returned by the service. - `com.amazonaws.services.mq.model.DeleteBrokerResult`"
  (^com.amazonaws.services.mq.model.DeleteBrokerResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.DeleteBrokerRequest request]
    (-> this (.deleteBroker request))))

(defn delete-user
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.mq.model.DeleteUserResult`"
  (^com.amazonaws.services.mq.model.DeleteUserResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn describe-configuration
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.DescribeConfigurationRequest`

  returns: Result of the DescribeConfiguration operation returned by the service. - `com.amazonaws.services.mq.model.DescribeConfigurationResult`"
  (^com.amazonaws.services.mq.model.DescribeConfigurationResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.DescribeConfigurationRequest request]
    (-> this (.describeConfiguration request))))

(defn create-tags
  "Description copied from interface: AmazonMQ

  request - A map of the key-value pairs for the resource tag. - `com.amazonaws.services.mq.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.mq.model.CreateTagsResult`"
  (^com.amazonaws.services.mq.model.CreateTagsResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn update-broker
  "Description copied from interface: AmazonMQ

  request - Updates the broker using the specified properties. - `com.amazonaws.services.mq.model.UpdateBrokerRequest`

  returns: Result of the UpdateBroker operation returned by the service. - `com.amazonaws.services.mq.model.UpdateBrokerResult`"
  (^com.amazonaws.services.mq.model.UpdateBrokerResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.UpdateBrokerRequest request]
    (-> this (.updateBroker request))))

(defn shutdown
  "Description copied from interface: AmazonMQ"
  ([^AbstractAmazonMQ this]
    (-> this (.shutdown))))

(defn reboot-broker
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.RebootBrokerRequest`

  returns: Result of the RebootBroker operation returned by the service. - `com.amazonaws.services.mq.model.RebootBrokerResult`"
  (^com.amazonaws.services.mq.model.RebootBrokerResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.RebootBrokerRequest request]
    (-> this (.rebootBroker request))))

(defn describe-broker-instance-options
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest`

  returns: Result of the DescribeBrokerInstanceOptions operation returned by the service. - `com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsResult`"
  (^com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest request]
    (-> this (.describeBrokerInstanceOptions request))))

(defn describe-user
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.mq.model.DescribeUserResult`"
  (^com.amazonaws.services.mq.model.DescribeUserResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.DescribeUserRequest request]
    (-> this (.describeUser request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonMQ

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonMQ this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-configuration
  "Description copied from interface: AmazonMQ

  request - Updates the specified configuration. - `com.amazonaws.services.mq.model.UpdateConfigurationRequest`

  returns: Result of the UpdateConfiguration operation returned by the service. - `com.amazonaws.services.mq.model.UpdateConfigurationResult`"
  (^com.amazonaws.services.mq.model.UpdateConfigurationResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.UpdateConfigurationRequest request]
    (-> this (.updateConfiguration request))))

(defn list-configuration-revisions
  "Description copied from interface: AmazonMQ

  request - `com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest`

  returns: Result of the ListConfigurationRevisions operation returned by the service. - `com.amazonaws.services.mq.model.ListConfigurationRevisionsResult`"
  (^com.amazonaws.services.mq.model.ListConfigurationRevisionsResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest request]
    (-> this (.listConfigurationRevisions request))))

(defn create-configuration
  "Description copied from interface: AmazonMQ

  request - Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version). - `com.amazonaws.services.mq.model.CreateConfigurationRequest`

  returns: Result of the CreateConfiguration operation returned by the service. - `com.amazonaws.services.mq.model.CreateConfigurationResult`"
  (^com.amazonaws.services.mq.model.CreateConfigurationResult [^AbstractAmazonMQ this ^com.amazonaws.services.mq.model.CreateConfigurationRequest request]
    (-> this (.createConfiguration request))))

