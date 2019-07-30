(ns com.amazonaws.services.mq.AbstractAmazonMQAsync
  "Abstract implementation of AmazonMQAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mq AbstractAmazonMQAsync]))

(defn reboot-broker-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.RebootBrokerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootBroker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.RebootBrokerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.RebootBrokerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootBrokerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.RebootBrokerRequest request]
    (-> this (.rebootBrokerAsync request))))

(defn update-broker-async
  "Description copied from interface: AmazonMQAsync

  request - Updates the broker using the specified properties. - `com.amazonaws.services.mq.model.UpdateBrokerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBroker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.UpdateBrokerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateBrokerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBrokerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateBrokerRequest request]
    (-> this (.updateBrokerAsync request))))

(defn describe-broker-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.DescribeBrokerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBroker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeBrokerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBrokerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerRequest request]
    (-> this (.describeBrokerAsync request))))

(defn list-configuration-revisions-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurationRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.ListConfigurationRevisionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationRevisionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.ListConfigurationRevisionsRequest request]
    (-> this (.listConfigurationRevisionsAsync request))))

(defn list-tags-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.ListTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.ListTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.ListTagsRequest request]
    (-> this (.listTagsAsync request))))

(defn delete-tags-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.DeleteTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteTagsRequest request]
    (-> this (.deleteTagsAsync request))))

(defn update-configuration-async
  "Description copied from interface: AmazonMQAsync

  request - Updates the specified configuration. - `com.amazonaws.services.mq.model.UpdateConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.UpdateConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateConfigurationRequest request]
    (-> this (.updateConfigurationAsync request))))

(defn delete-user-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.DeleteUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteUserRequest request]
    (-> this (.deleteUserAsync request))))

(defn describe-configuration-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.DescribeConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeConfigurationRequest request]
    (-> this (.describeConfigurationAsync request))))

(defn list-configurations-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.ListConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.ListConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.ListConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.ListConfigurationsRequest request]
    (-> this (.listConfigurationsAsync request))))

(defn create-configuration-async
  "Description copied from interface: AmazonMQAsync

  request - Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version). - `com.amazonaws.services.mq.model.CreateConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.CreateConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.CreateConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.CreateConfigurationRequest request]
    (-> this (.createConfigurationAsync request))))

(defn delete-broker-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.DeleteBrokerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBroker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DeleteBrokerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteBrokerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBrokerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DeleteBrokerRequest request]
    (-> this (.deleteBrokerAsync request))))

(defn describe-broker-engine-types-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBrokerEngineTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeBrokerEngineTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBrokerEngineTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerEngineTypesRequest request]
    (-> this (.describeBrokerEngineTypesAsync request))))

(defn list-brokers-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.ListBrokersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBrokers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.ListBrokersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.ListBrokersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBrokersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.ListBrokersRequest request]
    (-> this (.listBrokersAsync request))))

(defn create-user-async
  "Description copied from interface: AmazonMQAsync

  request - Creates a new ActiveMQ user. - `com.amazonaws.services.mq.model.CreateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.CreateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.CreateUserRequest request]
    (-> this (.createUserAsync request))))

(defn create-broker-async
  "Description copied from interface: AmazonMQAsync

  request - Creates a broker using the specified properties. - `com.amazonaws.services.mq.model.CreateBrokerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBroker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.CreateBrokerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.CreateBrokerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBrokerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.CreateBrokerRequest request]
    (-> this (.createBrokerAsync request))))

(defn describe-configuration-revision-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationRevision operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeConfigurationRevisionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationRevisionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeConfigurationRevisionRequest request]
    (-> this (.describeConfigurationRevisionAsync request))))

(defn create-tags-async
  "Description copied from interface: AmazonMQAsync

  request - A map of the key-value pairs for the resource tag. - `com.amazonaws.services.mq.model.CreateTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.CreateTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.CreateTagsRequest request]
    (-> this (.createTagsAsync request))))

(defn describe-broker-instance-options-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBrokerInstanceOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBrokerInstanceOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeBrokerInstanceOptionsRequest request]
    (-> this (.describeBrokerInstanceOptionsAsync request))))

(defn describe-user-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.DescribeUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.DescribeUserResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.DescribeUserRequest request]
    (-> this (.describeUserAsync request))))

(defn list-users-async
  "Description copied from interface: AmazonMQAsync

  request - `com.amazonaws.services.mq.model.ListUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.ListUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.ListUsersRequest request]
    (-> this (.listUsersAsync request))))

(defn update-user-async
  "Description copied from interface: AmazonMQAsync

  request - Updates the information for an ActiveMQ user. - `com.amazonaws.services.mq.model.UpdateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mq.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMQAsync this ^com.amazonaws.services.mq.model.UpdateUserRequest request]
    (-> this (.updateUserAsync request))))

