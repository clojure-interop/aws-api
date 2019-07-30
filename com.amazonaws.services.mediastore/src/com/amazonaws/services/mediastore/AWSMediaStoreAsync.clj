(ns com.amazonaws.services.mediastore.AWSMediaStoreAsync
  "Interface for accessing MediaStore asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaStoreAsync instead.



  An AWS Elemental MediaStore container is a namespace that holds folders and objects. You use a container endpoint to
  create, read, and delete objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastore AWSMediaStoreAsync]))

(defn untag-resource-async
  "Removes tags from the specified container. You can specify one or more tags to remove.

  untag-resource-request - `com.amazonaws.services.mediastore.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-lifecycle-policy-async
  "Retrieves the object lifecycle policy that is assigned to a container.

  get-lifecycle-policy-request - `com.amazonaws.services.mediastore.model.GetLifecyclePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.GetLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.GetLifecyclePolicyRequest get-lifecycle-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLifecyclePolicyAsync get-lifecycle-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.GetLifecyclePolicyRequest get-lifecycle-policy-request]
    (-> this (.getLifecyclePolicyAsync get-lifecycle-policy-request))))

(defn describe-container-async
  "Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a
   container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint
   does not change after it has been assigned. The DescribeContainer request returns a single
   Container object based on ContainerName. To return all Container objects
   that are associated with a specified AWS account, use ListContainers.

  describe-container-request - `com.amazonaws.services.mediastore.model.DescribeContainerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeContainer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.DescribeContainerResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.DescribeContainerRequest describe-container-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeContainerAsync describe-container-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.DescribeContainerRequest describe-container-request]
    (-> this (.describeContainerAsync describe-container-request))))

(defn delete-cors-policy-async
  "Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container.


   To use this operation, you must have permission to perform the MediaStore:DeleteCorsPolicy action.
   The container owner has this permission by default and can grant this permission to others.

  delete-cors-policy-request - `com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCorsPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest delete-cors-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCorsPolicyAsync delete-cors-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest delete-cors-policy-request]
    (-> this (.deleteCorsPolicyAsync delete-cors-policy-request))))

(defn delete-container-async
  "Deletes the specified container. Before you make a DeleteContainer request, delete any objects in
   the container or in any folders in the container. You can delete only empty containers.

  delete-container-request - `com.amazonaws.services.mediastore.model.DeleteContainerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteContainer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.DeleteContainerResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.DeleteContainerRequest delete-container-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteContainerAsync delete-container-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.DeleteContainerRequest delete-container-request]
    (-> this (.deleteContainerAsync delete-container-request))))

(defn delete-lifecycle-policy-async
  "Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.

  delete-lifecycle-policy-request - `com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyRequest delete-lifecycle-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLifecyclePolicyAsync delete-lifecycle-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyRequest delete-lifecycle-policy-request]
    (-> this (.deleteLifecyclePolicyAsync delete-lifecycle-policy-request))))

(defn get-cors-policy-async
  "Returns the cross-origin resource sharing (CORS) configuration information that is set for the container.


   To use this operation, you must have permission to perform the MediaStore:GetCorsPolicy action. By
   default, the container owner has this permission and can grant it to others.

  get-cors-policy-request - `com.amazonaws.services.mediastore.model.GetCorsPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCorsPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.GetCorsPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.GetCorsPolicyRequest get-cors-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCorsPolicyAsync get-cors-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.GetCorsPolicyRequest get-cors-policy-request]
    (-> this (.getCorsPolicyAsync get-cors-policy-request))))

(defn put-container-policy-async
  "Creates an access policy for the specified container to restrict the users and clients that can access it. For
   information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide.


   For this release of the REST API, you can create only one policy for a container. If you enter
   PutContainerPolicy twice, the second command modifies the existing policy.

  put-container-policy-request - `com.amazonaws.services.mediastore.model.PutContainerPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutContainerPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.PutContainerPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.PutContainerPolicyRequest put-container-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putContainerPolicyAsync put-container-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.PutContainerPolicyRequest put-container-policy-request]
    (-> this (.putContainerPolicyAsync put-container-policy-request))))

(defn list-containers-async
  "Lists the properties of all containers in AWS Elemental MediaStore.


   You can query to receive all the containers in one response. Or you can include the MaxResults
   parameter to receive a limited number of containers in each response. In this case, the response includes a
   token. To get the next set of containers, send the command again, this time with the NextToken
   parameter (with the returned token as its value). The next set of responses appears, with a token if there are
   still more containers to receive.


   See also DescribeContainer, which gets the properties of one container.

  list-containers-request - `com.amazonaws.services.mediastore.model.ListContainersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListContainers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.ListContainersResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.ListContainersRequest list-containers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listContainersAsync list-containers-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.ListContainersRequest list-containers-request]
    (-> this (.listContainersAsync list-containers-request))))

(defn create-container-async
  "Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.

  create-container-request - `com.amazonaws.services.mediastore.model.CreateContainerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateContainer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.CreateContainerResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.CreateContainerRequest create-container-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createContainerAsync create-container-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.CreateContainerRequest create-container-request]
    (-> this (.createContainerAsync create-container-request))))

(defn stop-access-logging-async
  "Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops
   sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.

  stop-access-logging-request - `com.amazonaws.services.mediastore.model.StopAccessLoggingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopAccessLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.StopAccessLoggingResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.StopAccessLoggingRequest stop-access-logging-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopAccessLoggingAsync stop-access-logging-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.StopAccessLoggingRequest stop-access-logging-request]
    (-> this (.stopAccessLoggingAsync stop-access-logging-request))))

(defn start-access-logging-async
  "Starts access logging on the specified container. When you enable access logging on a container, MediaStore
   delivers access logs for objects stored in that container to Amazon CloudWatch Logs.

  start-access-logging-request - `com.amazonaws.services.mediastore.model.StartAccessLoggingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartAccessLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.StartAccessLoggingResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.StartAccessLoggingRequest start-access-logging-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startAccessLoggingAsync start-access-logging-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.StartAccessLoggingRequest start-access-logging-request]
    (-> this (.startAccessLoggingAsync start-access-logging-request))))

(defn list-tags-for-resource-async
  "Returns a list of the tags assigned to the specified container.

  list-tags-for-resource-request - `com.amazonaws.services.mediastore.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn get-container-policy-async
  "Retrieves the access policy for the specified container. For information about the data that is included in an
   access policy, see the AWS Identity and Access Management
   User Guide.

  get-container-policy-request - `com.amazonaws.services.mediastore.model.GetContainerPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContainerPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.GetContainerPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.GetContainerPolicyRequest get-container-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContainerPolicyAsync get-container-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.GetContainerPolicyRequest get-container-policy-request]
    (-> this (.getContainerPolicyAsync get-container-policy-request))))

(defn put-lifecycle-policy-async
  "Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the
   service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take
   effect.


   For information about how to construct an object lifecycle policy, see Components of
   an Object Lifecycle Policy.

  put-lifecycle-policy-request - `com.amazonaws.services.mediastore.model.PutLifecyclePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLifecyclePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.PutLifecyclePolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.PutLifecyclePolicyRequest put-lifecycle-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLifecyclePolicyAsync put-lifecycle-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.PutLifecyclePolicyRequest put-lifecycle-policy-request]
    (-> this (.putLifecyclePolicyAsync put-lifecycle-policy-request))))

(defn delete-container-policy-async
  "Deletes the access policy that is associated with the specified container.

  delete-container-policy-request - `com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteContainerPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest delete-container-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteContainerPolicyAsync delete-container-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest delete-container-policy-request]
    (-> this (.deleteContainerPolicyAsync delete-container-policy-request))))

(defn put-cors-policy-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutCorsPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.PutCorsPolicyResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.PutCorsPolicyRequest put-cors-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putCorsPolicyAsync put-cors-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.PutCorsPolicyRequest put-cors-policy-request]
    (-> this (.putCorsPolicyAsync put-cors-policy-request))))

(defn tag-resource-async
  "Adds tags to the specified AWS Elemental MediaStore container. Tags are key:value pairs that you can associate
   with AWS resources. For example, the tag key might be \"customer\" and the tag value might be \"companyA.\" You can
   specify one or more tags to add to each container. You can add up to 50 tags to each container. For more
   information about tagging, including naming and usage conventions, see Tagging Resources in MediaStore.

  tag-resource-request - `com.amazonaws.services.mediastore.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastore.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreAsync this ^com.amazonaws.services.mediastore.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

