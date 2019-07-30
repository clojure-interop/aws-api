(ns com.amazonaws.services.dlm.AmazonDLMAsyncClient
  "Client for accessing Amazon DLM asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon Data Lifecycle Manager

  With Amazon Data Lifecycle Manager, you can manage the lifecycle of your AWS resources. You create lifecycle
  policies, which are used to automate operations on the specified resources.


  Amazon DLM supports Amazon EBS volumes and snapshots. For information about using Amazon DLM with Amazon EBS, see Automating the Amazon EBS Snapshot
  Lifecycle in the Amazon EC2 User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dlm AmazonDLMAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.dlm.AmazonDLMAsyncClientBuilder`"
  (^com.amazonaws.services.dlm.AmazonDLMAsyncClientBuilder []
    (AmazonDLMAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonDLMAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-lifecycle-policy-async
  "Description copied from interface: AmazonDLMAsync

  request - `com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.CreateLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonDLMAsyncClient this ^com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDLMAsyncClient this ^com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest request]
    (-> this (.createLifecyclePolicyAsync request))))

(defn delete-lifecycle-policy-async
  "Description copied from interface: AmazonDLMAsync

  request - `com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.DeleteLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonDLMAsyncClient this ^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDLMAsyncClient this ^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest request]
    (-> this (.deleteLifecyclePolicyAsync request))))

(defn get-lifecycle-policies-async
  "Description copied from interface: AmazonDLMAsync

  request - `com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.GetLifecyclePoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonDLMAsyncClient this ^com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDLMAsyncClient this ^com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest request]
    (-> this (.getLifecyclePoliciesAsync request))))

(defn get-lifecycle-policy-async
  "Description copied from interface: AmazonDLMAsync

  request - `com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.GetLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonDLMAsyncClient this ^com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDLMAsyncClient this ^com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest request]
    (-> this (.getLifecyclePolicyAsync request))))

(defn update-lifecycle-policy-async
  "Description copied from interface: AmazonDLMAsync

  request - `com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.UpdateLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonDLMAsyncClient this ^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDLMAsyncClient this ^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest request]
    (-> this (.updateLifecyclePolicyAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonDLMAsyncClient this]
    (-> this (.shutdown))))

