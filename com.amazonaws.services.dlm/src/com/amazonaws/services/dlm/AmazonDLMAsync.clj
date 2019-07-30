(ns com.amazonaws.services.dlm.AmazonDLMAsync
  "Interface for accessing Amazon DLM asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonDLMAsync instead.


  Amazon Data Lifecycle Manager

  With Amazon Data Lifecycle Manager, you can manage the lifecycle of your AWS resources. You create lifecycle
  policies, which are used to automate operations on the specified resources.


  Amazon DLM supports Amazon EBS volumes and snapshots. For information about using Amazon DLM with Amazon EBS, see Automating the Amazon EBS Snapshot
  Lifecycle in the Amazon EC2 User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dlm AmazonDLMAsync]))

(defn create-lifecycle-policy-async
  "Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle
   policies.

  create-lifecycle-policy-request - `com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.CreateLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonDLMAsync this ^com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest create-lifecycle-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLifecyclePolicyAsync create-lifecycle-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDLMAsync this ^com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest create-lifecycle-policy-request]
    (-> this (.createLifecyclePolicyAsync create-lifecycle-policy-request))))

(defn delete-lifecycle-policy-async
  "Deletes the specified lifecycle policy and halts the automated operations that the policy specified.

  delete-lifecycle-policy-request - `com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.DeleteLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonDLMAsync this ^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest delete-lifecycle-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLifecyclePolicyAsync delete-lifecycle-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDLMAsync this ^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest delete-lifecycle-policy-request]
    (-> this (.deleteLifecyclePolicyAsync delete-lifecycle-policy-request))))

(defn get-lifecycle-policies-async
  "Gets summary information about all or the specified data lifecycle policies.


   To get complete information about a policy, use GetLifecyclePolicy.

  get-lifecycle-policies-request - `com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.GetLifecyclePoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonDLMAsync this ^com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest get-lifecycle-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePoliciesAsync get-lifecycle-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDLMAsync this ^com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest get-lifecycle-policies-request]
    (-> this (.getLifecyclePoliciesAsync get-lifecycle-policies-request))))

(defn get-lifecycle-policy-async
  "Gets detailed information about the specified lifecycle policy.

  get-lifecycle-policy-request - `com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.GetLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonDLMAsync this ^com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest get-lifecycle-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePolicyAsync get-lifecycle-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDLMAsync this ^com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest get-lifecycle-policy-request]
    (-> this (.getLifecyclePolicyAsync get-lifecycle-policy-request))))

(defn update-lifecycle-policy-async
  "Updates the specified lifecycle policy.

  update-lifecycle-policy-request - `com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.UpdateLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonDLMAsync this ^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest update-lifecycle-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLifecyclePolicyAsync update-lifecycle-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDLMAsync this ^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest update-lifecycle-policy-request]
    (-> this (.updateLifecyclePolicyAsync update-lifecycle-policy-request))))

