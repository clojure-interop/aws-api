(ns com.amazonaws.services.mediastore.AWSMediaStoreAsyncClient
  "Client for accessing MediaStore asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  An AWS Elemental MediaStore container is a namespace that holds folders and objects. You use a container endpoint to
  create, read, and delete objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastore AWSMediaStoreAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.mediastore.AWSMediaStoreAsyncClientBuilder`"
  (^com.amazonaws.services.mediastore.AWSMediaStoreAsyncClientBuilder []
    (AWSMediaStoreAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-lifecycle-policy-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.GetLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.GetLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.GetLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.GetLifecyclePolicyRequest request]
    (-> this (.getLifecyclePolicyAsync request))))

(defn describe-container-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.DescribeContainerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeContainer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.DescribeContainerResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.DescribeContainerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeContainerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.DescribeContainerRequest request]
    (-> this (.describeContainerAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSMediaStoreAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-cors-policy-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCorsPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCorsPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest request]
    (-> this (.deleteCorsPolicyAsync request))))

(defn delete-container-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.DeleteContainerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteContainer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.DeleteContainerResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.DeleteContainerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteContainerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.DeleteContainerRequest request]
    (-> this (.deleteContainerAsync request))))

(defn delete-lifecycle-policy-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyRequest request]
    (-> this (.deleteLifecyclePolicyAsync request))))

(defn get-cors-policy-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.GetCorsPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCorsPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.GetCorsPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.GetCorsPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCorsPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.GetCorsPolicyRequest request]
    (-> this (.getCorsPolicyAsync request))))

(defn put-container-policy-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.PutContainerPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutContainerPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.PutContainerPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.PutContainerPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putContainerPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.PutContainerPolicyRequest request]
    (-> this (.putContainerPolicyAsync request))))

(defn list-containers-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.ListContainersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListContainers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.ListContainersResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.ListContainersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listContainersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.ListContainersRequest request]
    (-> this (.listContainersAsync request))))

(defn create-container-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.CreateContainerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateContainer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.CreateContainerResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.CreateContainerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createContainerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.CreateContainerRequest request]
    (-> this (.createContainerAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSMediaStoreAsyncClient this]
    (-> this (.shutdown))))

(defn stop-access-logging-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.StopAccessLoggingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopAccessLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.StopAccessLoggingResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.StopAccessLoggingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopAccessLoggingAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.StopAccessLoggingRequest request]
    (-> this (.stopAccessLoggingAsync request))))

(defn start-access-logging-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.StartAccessLoggingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartAccessLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.StartAccessLoggingResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.StartAccessLoggingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startAccessLoggingAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.StartAccessLoggingRequest request]
    (-> this (.startAccessLoggingAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn get-container-policy-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.GetContainerPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContainerPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.GetContainerPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.GetContainerPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContainerPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.GetContainerPolicyRequest request]
    (-> this (.getContainerPolicyAsync request))))

(defn put-lifecycle-policy-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.PutLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.PutLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.PutLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.PutLifecyclePolicyRequest request]
    (-> this (.putLifecyclePolicyAsync request))))

(defn delete-container-policy-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteContainerPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteContainerPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest request]
    (-> this (.deleteContainerPolicyAsync request))))

(defn put-cors-policy-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.PutCorsPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutCorsPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.PutCorsPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.PutCorsPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putCorsPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.PutCorsPolicyRequest request]
    (-> this (.putCorsPolicyAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSMediaStoreAsync

  request - `com.amazonaws.services.mediastore.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsyncClient this ^com.amazonaws.services.mediastore.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

