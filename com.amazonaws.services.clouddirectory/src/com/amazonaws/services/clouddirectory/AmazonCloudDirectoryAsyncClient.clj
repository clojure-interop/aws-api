(ns com.amazonaws.services.clouddirectory.AmazonCloudDirectoryAsyncClient
  "Client for accessing Amazon CloudDirectory asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon Cloud Directory

  Amazon Cloud Directory is a component of the AWS Directory Service that simplifies the development and management of
  cloud-scale web, mobile, and IoT applications. This guide describes the Cloud Directory operations that you can call
  programmatically and includes detailed information on data types and errors. For information about Cloud Directory
  features, see AWS Directory Service and the Amazon Cloud
  Directory Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.clouddirectory AmazonCloudDirectoryAsyncClient]))

(defn ->amazon-cloud-directory-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonCloudDirectoryAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudDirectoryAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonCloudDirectoryAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudDirectoryAsyncClient aws-credentials executor-service))
  (^AmazonCloudDirectoryAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudDirectoryAsyncClient client-configuration))
  (^AmazonCloudDirectoryAsyncClient []
    (new AmazonCloudDirectoryAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.clouddirectory.AmazonCloudDirectoryAsyncClientBuilder`"
  (^com.amazonaws.services.clouddirectory.AmazonCloudDirectoryAsyncClientBuilder []
    (AmazonCloudDirectoryAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn create-object-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.CreateObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateObjectRequest request]
    (-> this (.createObjectAsync request))))

(defn list-published-schema-arns-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPublishedSchemaArns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPublishedSchemaArnsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest request]
    (-> this (.listPublishedSchemaArnsAsync request))))

(defn attach-to-index-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.AttachToIndexRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachToIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.AttachToIndexResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.AttachToIndexRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachToIndexAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.AttachToIndexRequest request]
    (-> this (.attachToIndexAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonCloudDirectoryAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-development-schema-arns-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevelopmentSchemaArns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevelopmentSchemaArnsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest request]
    (-> this (.listDevelopmentSchemaArnsAsync request))))

(defn list-managed-schema-arns-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListManagedSchemaArns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listManagedSchemaArnsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest request]
    (-> this (.listManagedSchemaArnsAsync request))))

(defn get-directory-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.GetDirectoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetDirectoryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetDirectoryRequest request]
    (-> this (.getDirectoryAsync request))))

(defn list-facet-attributes-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFacetAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFacetAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest request]
    (-> this (.listFacetAttributesAsync request))))

(defn get-facet-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.GetFacetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetFacetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFacetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetFacetRequest request]
    (-> this (.getFacetAsync request))))

(defn list-applied-schema-arns-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAppliedSchemaArns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAppliedSchemaArnsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest request]
    (-> this (.listAppliedSchemaArnsAsync request))))

(defn attach-policy-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.AttachPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.AttachPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.AttachPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.AttachPolicyRequest request]
    (-> this (.attachPolicyAsync request))))

(defn create-facet-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.CreateFacetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateFacetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFacetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateFacetRequest request]
    (-> this (.createFacetAsync request))))

(defn create-index-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.CreateIndexRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateIndexResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateIndexRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIndexAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateIndexRequest request]
    (-> this (.createIndexAsync request))))

(defn list-typed-link-facet-names-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTypedLinkFacetNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTypedLinkFacetNamesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest request]
    (-> this (.listTypedLinkFacetNamesAsync request))))

(defn get-object-information-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetObjectInformation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetObjectInformationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getObjectInformationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest request]
    (-> this (.getObjectInformationAsync request))))

(defn update-facet-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.UpdateFacetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpdateFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpdateFacetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFacetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpdateFacetRequest request]
    (-> this (.updateFacetAsync request))))

(defn list-policy-attachments-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicyAttachments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPolicyAttachmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest request]
    (-> this (.listPolicyAttachmentsAsync request))))

(defn delete-facet-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.DeleteFacetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DeleteFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DeleteFacetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFacetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DeleteFacetRequest request]
    (-> this (.deleteFacetAsync request))))

(defn put-schema-from-json-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSchemaFromJson operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSchemaFromJsonAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest request]
    (-> this (.putSchemaFromJsonAsync request))))

(defn attach-typed-link-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachTypedLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachTypedLinkAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest request]
    (-> this (.attachTypedLinkAsync request))))

(defn detach-policy-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.DetachPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DetachPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DetachPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DetachPolicyRequest request]
    (-> this (.detachPolicyAsync request))))

(defn update-link-attributes-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLinkAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLinkAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest request]
    (-> this (.updateLinkAttributesAsync request))))

(defn attach-object-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.AttachObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.AttachObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.AttachObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.AttachObjectRequest request]
    (-> this (.attachObjectAsync request))))

(defn update-typed-link-facet-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTypedLinkFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTypedLinkFacetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest request]
    (-> this (.updateTypedLinkFacetAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonCloudDirectoryAsyncClient this]
    (-> this (.shutdown))))

(defn detach-typed-link-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachTypedLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachTypedLinkAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest request]
    (-> this (.detachTypedLinkAsync request))))

(defn add-facet-to-object-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddFacetToObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addFacetToObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest request]
    (-> this (.addFacetToObjectAsync request))))

(defn create-typed-link-facet-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTypedLinkFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTypedLinkFacetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest request]
    (-> this (.createTypedLinkFacetAsync request))))

(defn get-typed-link-facet-information-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTypedLinkFacetInformation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTypedLinkFacetInformationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest request]
    (-> this (.getTypedLinkFacetInformationAsync request))))

(defn get-link-attributes-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLinkAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetLinkAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLinkAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest request]
    (-> this (.getLinkAttributesAsync request))))

(defn delete-schema-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DeleteSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest request]
    (-> this (.deleteSchemaAsync request))))

(defn detach-from-index-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachFromIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DetachFromIndexResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachFromIndexAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest request]
    (-> this (.detachFromIndexAsync request))))

(defn disable-directory-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DisableDirectoryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest request]
    (-> this (.disableDirectoryAsync request))))

(defn list-attached-indices-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttachedIndices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttachedIndicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest request]
    (-> this (.listAttachedIndicesAsync request))))

(defn list-object-attributes-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListObjectAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listObjectAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest request]
    (-> this (.listObjectAttributesAsync request))))

(defn get-applied-schema-version-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAppliedSchemaVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppliedSchemaVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest request]
    (-> this (.getAppliedSchemaVersionAsync request))))

(defn lookup-policy-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.LookupPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LookupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.LookupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.LookupPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.lookupPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.LookupPolicyRequest request]
    (-> this (.lookupPolicyAsync request))))

(defn update-schema-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpdateSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest request]
    (-> this (.updateSchemaAsync request))))

(defn list-outgoing-typed-links-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOutgoingTypedLinks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOutgoingTypedLinksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest request]
    (-> this (.listOutgoingTypedLinksAsync request))))

(defn list-object-parent-paths-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListObjectParentPaths operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listObjectParentPathsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest request]
    (-> this (.listObjectParentPathsAsync request))))

(defn get-object-attributes-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetObjectAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetObjectAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getObjectAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest request]
    (-> this (.getObjectAttributesAsync request))))

(defn delete-directory-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest request]
    (-> this (.deleteDirectoryAsync request))))

(defn list-facet-names-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFacetNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListFacetNamesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFacetNamesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest request]
    (-> this (.listFacetNamesAsync request))))

(defn apply-schema-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ApplySchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplySchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ApplySchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ApplySchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applySchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ApplySchemaRequest request]
    (-> this (.applySchemaAsync request))))

(defn enable-directory-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.EnableDirectoryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest request]
    (-> this (.enableDirectoryAsync request))))

(defn list-typed-link-facet-attributes-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTypedLinkFacetAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTypedLinkFacetAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest request]
    (-> this (.listTypedLinkFacetAttributesAsync request))))

(defn list-directories-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDirectories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListDirectoriesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDirectoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest request]
    (-> this (.listDirectoriesAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn list-object-policies-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListObjectPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listObjectPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest request]
    (-> this (.listObjectPoliciesAsync request))))

(defn update-object-attributes-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateObjectAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateObjectAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest request]
    (-> this (.updateObjectAttributesAsync request))))

(defn batch-write-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.BatchWriteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchWrite operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.BatchWriteResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.BatchWriteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchWriteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.BatchWriteRequest request]
    (-> this (.batchWriteAsync request))))

(defn create-schema-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.CreateSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateSchemaRequest request]
    (-> this (.createSchemaAsync request))))

(defn delete-object-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.DeleteObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DeleteObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DeleteObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DeleteObjectRequest request]
    (-> this (.deleteObjectAsync request))))

(defn delete-typed-link-facet-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTypedLinkFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTypedLinkFacetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest request]
    (-> this (.deleteTypedLinkFacetAsync request))))

(defn publish-schema-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.PublishSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PublishSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.PublishSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.PublishSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.PublishSchemaRequest request]
    (-> this (.publishSchemaAsync request))))

(defn create-directory-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateDirectoryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest request]
    (-> this (.createDirectoryAsync request))))

(defn list-index-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListIndexRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListIndexResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListIndexRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIndexAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListIndexRequest request]
    (-> this (.listIndexAsync request))))

(defn detach-object-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.DetachObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DetachObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DetachObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.DetachObjectRequest request]
    (-> this (.detachObjectAsync request))))

(defn list-incoming-typed-links-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIncomingTypedLinks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIncomingTypedLinksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest request]
    (-> this (.listIncomingTypedLinksAsync request))))

(defn batch-read-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.BatchReadRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchRead operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.BatchReadResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.BatchReadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchReadAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.BatchReadRequest request]
    (-> this (.batchReadAsync request))))

(defn list-object-parents-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListObjectParents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListObjectParentsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listObjectParentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest request]
    (-> this (.listObjectParentsAsync request))))

(defn upgrade-published-schema-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpgradePublishedSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.upgradePublishedSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest request]
    (-> this (.upgradePublishedSchemaAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn remove-facet-from-object-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveFacetFromObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeFacetFromObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest request]
    (-> this (.removeFacetFromObjectAsync request))))

(defn upgrade-applied-schema-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpgradeAppliedSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.upgradeAppliedSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest request]
    (-> this (.upgradeAppliedSchemaAsync request))))

(defn get-schema-as-json-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSchemaAsJson operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSchemaAsJsonAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest request]
    (-> this (.getSchemaAsJsonAsync request))))

(defn list-object-children-async
  "Description copied from interface: AmazonCloudDirectoryAsync

  request - `com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListObjectChildren operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listObjectChildrenAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsyncClient this ^com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest request]
    (-> this (.listObjectChildrenAsync request))))

