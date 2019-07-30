(ns com.amazonaws.services.dlm.AmazonDLMClient
  "Client for accessing Amazon DLM. All service calls made using this client are blocking, and will not return until the
  service call completes.

  Amazon Data Lifecycle Manager

  With Amazon Data Lifecycle Manager, you can manage the lifecycle of your AWS resources. You create lifecycle
  policies, which are used to automate operations on the specified resources.


  Amazon DLM supports Amazon EBS volumes and snapshots. For information about using Amazon DLM with Amazon EBS, see Automating the Amazon EBS Snapshot
  Lifecycle in the Amazon EC2 User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dlm AmazonDLMClient]))

(defn *builder
  "returns: `com.amazonaws.services.dlm.AmazonDLMClientBuilder`"
  (^com.amazonaws.services.dlm.AmazonDLMClientBuilder []
    (AmazonDLMClient/builder )))

(defn create-lifecycle-policy
  "Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle
   policies.

  request - `com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest`

  returns: Result of the CreateLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.CreateLifecyclePolicyResult`

  throws: com.amazonaws.services.dlm.model.InvalidRequestException - Bad request. The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.dlm.model.CreateLifecyclePolicyResult [^AmazonDLMClient this ^com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest request]
    (-> this (.createLifecyclePolicy request))))

(defn delete-lifecycle-policy
  "Deletes the specified lifecycle policy and halts the automated operations that the policy specified.

  request - `com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest`

  returns: Result of the DeleteLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.DeleteLifecyclePolicyResult`

  throws: com.amazonaws.services.dlm.model.ResourceNotFoundException - A requested resource was not found."
  (^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyResult [^AmazonDLMClient this ^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest request]
    (-> this (.deleteLifecyclePolicy request))))

(defn get-lifecycle-policies
  "Gets summary information about all or the specified data lifecycle policies.


   To get complete information about a policy, use GetLifecyclePolicy.

  request - `com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest`

  returns: Result of the GetLifecyclePolicies operation returned by the service. - `com.amazonaws.services.dlm.model.GetLifecyclePoliciesResult`

  throws: com.amazonaws.services.dlm.model.ResourceNotFoundException - A requested resource was not found."
  (^com.amazonaws.services.dlm.model.GetLifecyclePoliciesResult [^AmazonDLMClient this ^com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest request]
    (-> this (.getLifecyclePolicies request))))

(defn get-lifecycle-policy
  "Gets detailed information about the specified lifecycle policy.

  request - `com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest`

  returns: Result of the GetLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.GetLifecyclePolicyResult`

  throws: com.amazonaws.services.dlm.model.ResourceNotFoundException - A requested resource was not found."
  (^com.amazonaws.services.dlm.model.GetLifecyclePolicyResult [^AmazonDLMClient this ^com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest request]
    (-> this (.getLifecyclePolicy request))))

(defn update-lifecycle-policy
  "Updates the specified lifecycle policy.

  request - `com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest`

  returns: Result of the UpdateLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.UpdateLifecyclePolicyResult`

  throws: com.amazonaws.services.dlm.model.ResourceNotFoundException - A requested resource was not found."
  (^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyResult [^AmazonDLMClient this ^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest request]
    (-> this (.updateLifecyclePolicy request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonDLMClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

