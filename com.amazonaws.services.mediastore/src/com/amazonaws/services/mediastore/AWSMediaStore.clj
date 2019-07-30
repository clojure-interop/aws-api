(ns com.amazonaws.services.mediastore.AWSMediaStore
  "Interface for accessing MediaStore.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaStore instead.



  An AWS Elemental MediaStore container is a namespace that holds folders and objects. You use a container endpoint to
  create, read, and delete objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastore AWSMediaStore]))

(defn create-container
  "Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.

  create-container-request - `com.amazonaws.services.mediastore.model.CreateContainerRequest`

  returns: Result of the CreateContainer operation returned by the service. - `com.amazonaws.services.mediastore.model.CreateContainerResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.CreateContainerResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.CreateContainerRequest create-container-request]
    (-> this (.createContainer create-container-request))))

(defn list-tags-for-resource
  "Returns a list of the tags assigned to the specified container.

  list-tags-for-resource-request - `com.amazonaws.services.mediastore.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediastore.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.ListTagsForResourceResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn get-lifecycle-policy
  "Retrieves the object lifecycle policy that is assigned to a container.

  get-lifecycle-policy-request - `com.amazonaws.services.mediastore.model.GetLifecyclePolicyRequest`

  returns: Result of the GetLifecyclePolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.GetLifecyclePolicyResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.GetLifecyclePolicyResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.GetLifecyclePolicyRequest get-lifecycle-policy-request]
    (-> this (.getLifecyclePolicy get-lifecycle-policy-request))))

(defn delete-cors-policy
  "Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container.


   To use this operation, you must have permission to perform the MediaStore:DeleteCorsPolicy action.
   The container owner has this permission by default and can grant this permission to others.

  delete-cors-policy-request - `com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest`

  returns: Result of the DeleteCorsPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest delete-cors-policy-request]
    (-> this (.deleteCorsPolicy delete-cors-policy-request))))

(defn put-cors-policy
  "Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service
   cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to
   access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest
   capability.


   To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules
   that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to
   398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses
   the first applicable rule listed.


   To learn more about CORS, see Cross-Origin Resource Sharing (CORS) in
   AWS Elemental MediaStore.

  put-cors-policy-request - `com.amazonaws.services.mediastore.model.PutCorsPolicyRequest`

  returns: Result of the PutCorsPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.PutCorsPolicyResult`

  throws: com.amazonaws.services.mediastore.model.ContainerNotFoundException - The container that you specified in the request does not exist."
  (^com.amazonaws.services.mediastore.model.PutCorsPolicyResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.PutCorsPolicyRequest put-cors-policy-request]
    (-> this (.putCorsPolicy put-cors-policy-request))))

(defn describe-container
  "Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a
   container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint
   does not change after it has been assigned. The DescribeContainer request returns a single
   Container object based on ContainerName. To return all Container objects
   that are associated with a specified AWS account, use ListContainers.

  describe-container-request - `com.amazonaws.services.mediastore.model.DescribeContainerRequest`

  returns: Result of the DescribeContainer operation returned by the service. - `com.amazonaws.services.mediastore.model.DescribeContainerResult`

  throws: com.amazonaws.services.mediastore.model.ContainerNotFoundException - The container that you specified in the request does not exist."
  (^com.amazonaws.services.mediastore.model.DescribeContainerResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.DescribeContainerRequest describe-container-request]
    (-> this (.describeContainer describe-container-request))))

(defn untag-resource
  "Removes tags from the specified container. You can specify one or more tags to remove.

  untag-resource-request - `com.amazonaws.services.mediastore.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediastore.model.UntagResourceResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.UntagResourceResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn delete-lifecycle-policy
  "Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.

  delete-lifecycle-policy-request - `com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyRequest`

  returns: Result of the DeleteLifecyclePolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyRequest delete-lifecycle-policy-request]
    (-> this (.deleteLifecyclePolicy delete-lifecycle-policy-request))))

(defn put-container-policy
  "Creates an access policy for the specified container to restrict the users and clients that can access it. For
   information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide.


   For this release of the REST API, you can create only one policy for a container. If you enter
   PutContainerPolicy twice, the second command modifies the existing policy.

  put-container-policy-request - `com.amazonaws.services.mediastore.model.PutContainerPolicyRequest`

  returns: Result of the PutContainerPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.PutContainerPolicyResult`

  throws: com.amazonaws.services.mediastore.model.ContainerNotFoundException - The container that you specified in the request does not exist."
  (^com.amazonaws.services.mediastore.model.PutContainerPolicyResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.PutContainerPolicyRequest put-container-policy-request]
    (-> this (.putContainerPolicy put-container-policy-request))))

(defn get-cors-policy
  "Returns the cross-origin resource sharing (CORS) configuration information that is set for the container.


   To use this operation, you must have permission to perform the MediaStore:GetCorsPolicy action. By
   default, the container owner has this permission and can grant it to others.

  get-cors-policy-request - `com.amazonaws.services.mediastore.model.GetCorsPolicyRequest`

  returns: Result of the GetCorsPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.GetCorsPolicyResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.GetCorsPolicyResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.GetCorsPolicyRequest get-cors-policy-request]
    (-> this (.getCorsPolicy get-cors-policy-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSMediaStore this]
    (-> this (.shutdown))))

(defn delete-container
  "Deletes the specified container. Before you make a DeleteContainer request, delete any objects in
   the container or in any folders in the container. You can delete only empty containers.

  delete-container-request - `com.amazonaws.services.mediastore.model.DeleteContainerRequest`

  returns: Result of the DeleteContainer operation returned by the service. - `com.amazonaws.services.mediastore.model.DeleteContainerResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.DeleteContainerResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.DeleteContainerRequest delete-container-request]
    (-> this (.deleteContainer delete-container-request))))

(defn delete-container-policy
  "Deletes the access policy that is associated with the specified container.

  delete-container-policy-request - `com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest`

  returns: Result of the DeleteContainerPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest delete-container-policy-request]
    (-> this (.deleteContainerPolicy delete-container-policy-request))))

(defn list-containers
  "Lists the properties of all containers in AWS Elemental MediaStore.


   You can query to receive all the containers in one response. Or you can include the MaxResults
   parameter to receive a limited number of containers in each response. In this case, the response includes a
   token. To get the next set of containers, send the command again, this time with the NextToken
   parameter (with the returned token as its value). The next set of responses appears, with a token if there are
   still more containers to receive.


   See also DescribeContainer, which gets the properties of one container.

  list-containers-request - `com.amazonaws.services.mediastore.model.ListContainersRequest`

  returns: Result of the ListContainers operation returned by the service. - `com.amazonaws.services.mediastore.model.ListContainersResult`

  throws: com.amazonaws.services.mediastore.model.InternalServerErrorException - The service is temporarily unavailable."
  (^com.amazonaws.services.mediastore.model.ListContainersResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.ListContainersRequest list-containers-request]
    (-> this (.listContainers list-containers-request))))

(defn start-access-logging
  "Starts access logging on the specified container. When you enable access logging on a container, MediaStore
   delivers access logs for objects stored in that container to Amazon CloudWatch Logs.

  start-access-logging-request - `com.amazonaws.services.mediastore.model.StartAccessLoggingRequest`

  returns: Result of the StartAccessLogging operation returned by the service. - `com.amazonaws.services.mediastore.model.StartAccessLoggingResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.StartAccessLoggingResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.StartAccessLoggingRequest start-access-logging-request]
    (-> this (.startAccessLogging start-access-logging-request))))

(defn stop-access-logging
  "Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops
   sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.

  stop-access-logging-request - `com.amazonaws.services.mediastore.model.StopAccessLoggingRequest`

  returns: Result of the StopAccessLogging operation returned by the service. - `com.amazonaws.services.mediastore.model.StopAccessLoggingResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.StopAccessLoggingResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.StopAccessLoggingRequest stop-access-logging-request]
    (-> this (.stopAccessLogging stop-access-logging-request))))

(defn get-container-policy
  "Retrieves the access policy for the specified container. For information about the data that is included in an
   access policy, see the AWS Identity and Access Management
   User Guide.

  get-container-policy-request - `com.amazonaws.services.mediastore.model.GetContainerPolicyRequest`

  returns: Result of the GetContainerPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.GetContainerPolicyResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.GetContainerPolicyResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.GetContainerPolicyRequest get-container-policy-request]
    (-> this (.getContainerPolicy get-container-policy-request))))

(defn put-lifecycle-policy
  "Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the
   service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take
   effect.


   For information about how to construct an object lifecycle policy, see Components of
   an Object Lifecycle Policy.

  put-lifecycle-policy-request - `com.amazonaws.services.mediastore.model.PutLifecyclePolicyRequest`

  returns: Result of the PutLifecyclePolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.PutLifecyclePolicyResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.PutLifecyclePolicyResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.PutLifecyclePolicyRequest put-lifecycle-policy-request]
    (-> this (.putLifecyclePolicy put-lifecycle-policy-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaStore this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Adds tags to the specified AWS Elemental MediaStore container. Tags are key:value pairs that you can associate
   with AWS resources. For example, the tag key might be \"customer\" and the tag value might be \"companyA.\" You can
   specify one or more tags to add to each container. You can add up to 50 tags to each container. For more
   information about tagging, including naming and usage conventions, see Tagging Resources in MediaStore.

  tag-resource-request - `com.amazonaws.services.mediastore.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediastore.model.TagResourceResult`

  throws: com.amazonaws.services.mediastore.model.ContainerInUseException - The container that you specified in the request already exists or is being updated."
  (^com.amazonaws.services.mediastore.model.TagResourceResult [^AWSMediaStore this ^com.amazonaws.services.mediastore.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

