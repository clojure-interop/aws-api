(ns com.amazonaws.services.dlm.AmazonDLM
  "Interface for accessing Amazon DLM.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonDLM instead.


  Amazon Data Lifecycle Manager

  With Amazon Data Lifecycle Manager, you can manage the lifecycle of your AWS resources. You create lifecycle
  policies, which are used to automate operations on the specified resources.


  Amazon DLM supports Amazon EBS volumes and snapshots. For information about using Amazon DLM with Amazon EBS, see Automating the Amazon EBS Snapshot
  Lifecycle in the Amazon EC2 User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dlm AmazonDLM]))

(defn create-lifecycle-policy
  "Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle
   policies.

  create-lifecycle-policy-request - `com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest`

  returns: Result of the CreateLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.CreateLifecyclePolicyResult`

  throws: com.amazonaws.services.dlm.model.InvalidRequestException - Bad request. The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.dlm.model.CreateLifecyclePolicyResult [^AmazonDLM this ^com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest create-lifecycle-policy-request]
    (-> this (.createLifecyclePolicy create-lifecycle-policy-request))))

(defn delete-lifecycle-policy
  "Deletes the specified lifecycle policy and halts the automated operations that the policy specified.

  delete-lifecycle-policy-request - `com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest`

  returns: Result of the DeleteLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.DeleteLifecyclePolicyResult`

  throws: com.amazonaws.services.dlm.model.ResourceNotFoundException - A requested resource was not found."
  (^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyResult [^AmazonDLM this ^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest delete-lifecycle-policy-request]
    (-> this (.deleteLifecyclePolicy delete-lifecycle-policy-request))))

(defn get-lifecycle-policies
  "Gets summary information about all or the specified data lifecycle policies.


   To get complete information about a policy, use GetLifecyclePolicy.

  get-lifecycle-policies-request - `com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest`

  returns: Result of the GetLifecyclePolicies operation returned by the service. - `com.amazonaws.services.dlm.model.GetLifecyclePoliciesResult`

  throws: com.amazonaws.services.dlm.model.ResourceNotFoundException - A requested resource was not found."
  (^com.amazonaws.services.dlm.model.GetLifecyclePoliciesResult [^AmazonDLM this ^com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest get-lifecycle-policies-request]
    (-> this (.getLifecyclePolicies get-lifecycle-policies-request))))

(defn get-lifecycle-policy
  "Gets detailed information about the specified lifecycle policy.

  get-lifecycle-policy-request - `com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest`

  returns: Result of the GetLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.GetLifecyclePolicyResult`

  throws: com.amazonaws.services.dlm.model.ResourceNotFoundException - A requested resource was not found."
  (^com.amazonaws.services.dlm.model.GetLifecyclePolicyResult [^AmazonDLM this ^com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest get-lifecycle-policy-request]
    (-> this (.getLifecyclePolicy get-lifecycle-policy-request))))

(defn update-lifecycle-policy
  "Updates the specified lifecycle policy.

  update-lifecycle-policy-request - `com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest`

  returns: Result of the UpdateLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.UpdateLifecyclePolicyResult`

  throws: com.amazonaws.services.dlm.model.ResourceNotFoundException - A requested resource was not found."
  (^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyResult [^AmazonDLM this ^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest update-lifecycle-policy-request]
    (-> this (.updateLifecyclePolicy update-lifecycle-policy-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonDLM this]
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
  (^com.amazonaws.ResponseMetadata [^AmazonDLM this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

