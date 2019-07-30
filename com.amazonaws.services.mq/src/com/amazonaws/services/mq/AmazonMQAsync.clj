(ns com.amazonaws.services.mq.AmazonMQAsync
  "Interface for accessing AmazonMQ asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonMQAsync instead.


  Amazon MQ is a managed message broker service for Apache ActiveMQ that makes it easy to set up and operate message
  brokers in the cloud. A message broker allows software applications and components to communicate using various
  programming languages, operating systems, and formal messaging protocols."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mq AmazonMQAsync]))

(defn reboot-broker-async
  "Reboots a broker. Note: This API is asynchronous.

  reboot-broker-request - `com.amazonaws.services.mq.model.RebootBrokerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootBroker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.RebootBrokerResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.RebootBrokerRequest reboot-broker-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootBrokerAsync reboot-broker-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.RebootBrokerRequest reboot-broker-request]
    (-> this (.rebootBrokerAsync reboot-broker-request))))

(defn update-broker-async
  "Adds a pending configuration change to a broker.

  update-broker-request - Updates the broker using the specified properties. - `com.amazonaws.services.mq.model.UpdateBrokerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBroker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.UpdateBrokerResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateBrokerRequest update-broker-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBrokerAsync update-broker-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateBrokerRequest update-broker-request]
    (-> this (.updateBrokerAsync update-broker-request))))

(defn describe-broker-async
  "Returns information about the specified broker.

  describe-broker-request - `com.amazonaws.services.mq.model.DescribeBrokerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBroker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeBrokerResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerRequest describe-broker-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBrokerAsync describe-broker-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerRequest describe-broker-request]
    (-> this (.describeBrokerAsync describe-broker-request))))

(defn list-configuration-revisions-async
  "Returns a list of all revisions for the specified configuration.

  list-configuration-revisions-request - `com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurationRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.ListConfigurationRevisionsResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest list-configuration-revisions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationRevisionsAsync list-configuration-revisions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest list-configuration-revisions-request]
    (-> this (.listConfigurationRevisionsAsync list-configuration-revisions-request))))

(defn list-tags-async
  "Lists tags for a resource.

  list-tags-request - `com.amazonaws.services.mq.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.ListTagsRequest list-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync list-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.ListTagsRequest list-tags-request]
    (-> this (.listTagsAsync list-tags-request))))

(defn delete-tags-async
  "Removes a tag from a resource.

  delete-tags-request - `com.amazonaws.services.mq.model.DeleteTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteTagsRequest delete-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync delete-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTagsAsync delete-tags-request))))

(defn update-configuration-async
  "Updates the specified configuration.

  update-configuration-request - Updates the specified configuration. - `com.amazonaws.services.mq.model.UpdateConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.UpdateConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateConfigurationRequest update-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationAsync update-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateConfigurationRequest update-configuration-request]
    (-> this (.updateConfigurationAsync update-configuration-request))))

(defn delete-user-async
  "Deletes an ActiveMQ user.

  delete-user-request - `com.amazonaws.services.mq.model.DeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteUserRequest delete-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync delete-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUserAsync delete-user-request))))

(defn describe-configuration-async
  "Returns information about the specified configuration.

  describe-configuration-request - `com.amazonaws.services.mq.model.DescribeConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeConfigurationRequest describe-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationAsync describe-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeConfigurationRequest describe-configuration-request]
    (-> this (.describeConfigurationAsync describe-configuration-request))))

(defn list-configurations-async
  "Returns a list of all configurations.

  list-configurations-request - `com.amazonaws.services.mq.model.ListConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.ListConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.ListConfigurationsRequest list-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationsAsync list-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.ListConfigurationsRequest list-configurations-request]
    (-> this (.listConfigurationsAsync list-configurations-request))))

(defn create-configuration-async
  "Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the
   engine type and version).

  create-configuration-request - Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version). - `com.amazonaws.services.mq.model.CreateConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.CreateConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.CreateConfigurationRequest create-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationAsync create-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.CreateConfigurationRequest create-configuration-request]
    (-> this (.createConfigurationAsync create-configuration-request))))

(defn delete-broker-async
  "Deletes a broker. Note: This API is asynchronous.

  delete-broker-request - `com.amazonaws.services.mq.model.DeleteBrokerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBroker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DeleteBrokerResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteBrokerRequest delete-broker-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBrokerAsync delete-broker-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteBrokerRequest delete-broker-request]
    (-> this (.deleteBrokerAsync delete-broker-request))))

(defn describe-broker-engine-types-async
  "Describe available engine types and versions.

  describe-broker-engine-types-request - `com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBrokerEngineTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeBrokerEngineTypesResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest describe-broker-engine-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBrokerEngineTypesAsync describe-broker-engine-types-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest describe-broker-engine-types-request]
    (-> this (.describeBrokerEngineTypesAsync describe-broker-engine-types-request))))

(defn list-brokers-async
  "Returns a list of all brokers.

  list-brokers-request - `com.amazonaws.services.mq.model.ListBrokersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBrokers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.ListBrokersResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.ListBrokersRequest list-brokers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBrokersAsync list-brokers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.ListBrokersRequest list-brokers-request]
    (-> this (.listBrokersAsync list-brokers-request))))

(defn create-user-async
  "Creates an ActiveMQ user.

  create-user-request - Creates a new ActiveMQ user. - `com.amazonaws.services.mq.model.CreateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.CreateUserRequest create-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync create-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.CreateUserRequest create-user-request]
    (-> this (.createUserAsync create-user-request))))

(defn create-broker-async
  "Creates a broker. Note: This API is asynchronous.

  create-broker-request - Creates a broker using the specified properties. - `com.amazonaws.services.mq.model.CreateBrokerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBroker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.CreateBrokerResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.CreateBrokerRequest create-broker-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBrokerAsync create-broker-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.CreateBrokerRequest create-broker-request]
    (-> this (.createBrokerAsync create-broker-request))))

(defn describe-configuration-revision-async
  "Returns the specified configuration revision for the specified configuration.

  describe-configuration-revision-request - `com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationRevision operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest describe-configuration-revision-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationRevisionAsync describe-configuration-revision-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest describe-configuration-revision-request]
    (-> this (.describeConfigurationRevisionAsync describe-configuration-revision-request))))

(defn create-tags-async
  "Add a tag to a resource.

  create-tags-request - A map of the key-value pairs for the resource tag. - `com.amazonaws.services.mq.model.CreateTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.CreateTagsRequest create-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync create-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.CreateTagsRequest create-tags-request]
    (-> this (.createTagsAsync create-tags-request))))

(defn describe-broker-instance-options-async
  "Describe available broker instance options.

  describe-broker-instance-options-request - `com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBrokerInstanceOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest describe-broker-instance-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBrokerInstanceOptionsAsync describe-broker-instance-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest describe-broker-instance-options-request]
    (-> this (.describeBrokerInstanceOptionsAsync describe-broker-instance-options-request))))

(defn describe-user-async
  "Returns information about an ActiveMQ user.

  describe-user-request - `com.amazonaws.services.mq.model.DescribeUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeUserResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeUserRequest describe-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserAsync describe-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeUserRequest describe-user-request]
    (-> this (.describeUserAsync describe-user-request))))

(defn list-users-async
  "Returns a list of all ActiveMQ users.

  list-users-request - `com.amazonaws.services.mq.model.ListUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.ListUsersRequest list-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync list-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.ListUsersRequest list-users-request]
    (-> this (.listUsersAsync list-users-request))))

(defn update-user-async
  "Updates the information for an ActiveMQ user.

  update-user-request - Updates the information for an ActiveMQ user. - `com.amazonaws.services.mq.model.UpdateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateUserRequest update-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync update-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateUserRequest update-user-request]
    (-> this (.updateUserAsync update-user-request))))

