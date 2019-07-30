(ns com.amazonaws.services.dlm.AbstractAmazonDLMAsync
  "Abstract implementation of AmazonDLMAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dlm AbstractAmazonDLMAsync]))

(defn create-lifecycle-policy-async
  "Description copied from interface: AmazonDLMAsync

  request - `com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.CreateLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDLMAsync this ^com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDLMAsync this ^com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest request]
    (-> this (.createLifecyclePolicyAsync request))))

(defn delete-lifecycle-policy-async
  "Description copied from interface: AmazonDLMAsync

  request - `com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.DeleteLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDLMAsync this ^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDLMAsync this ^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest request]
    (-> this (.deleteLifecyclePolicyAsync request))))

(defn get-lifecycle-policies-async
  "Description copied from interface: AmazonDLMAsync

  request - `com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.GetLifecyclePoliciesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDLMAsync this ^com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDLMAsync this ^com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest request]
    (-> this (.getLifecyclePoliciesAsync request))))

(defn get-lifecycle-policy-async
  "Description copied from interface: AmazonDLMAsync

  request - `com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.GetLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDLMAsync this ^com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDLMAsync this ^com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest request]
    (-> this (.getLifecyclePolicyAsync request))))

(defn update-lifecycle-policy-async
  "Description copied from interface: AmazonDLMAsync

  request - `com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dlm.model.UpdateLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDLMAsync this ^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLifecyclePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDLMAsync this ^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest request]
    (-> this (.updateLifecyclePolicyAsync request))))

