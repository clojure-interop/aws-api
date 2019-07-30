(ns com.amazonaws.services.elasticsearch.AWSElasticsearchAsyncClient
  "Client for accessing Amazon Elasticsearch Service asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon Elasticsearch Configuration Service

  Use the Amazon Elasticsearch configuration API to create, configure, and manage Elasticsearch domains.


  The endpoint for configuration service requests is region-specific: es.region.amazonaws.com. For example,
  es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see Regions
  and Endpoints."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticsearch AWSElasticsearchAsyncClient]))

(defn ->aws-elasticsearch-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSElasticsearchAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSElasticsearchAsyncClient aws-credentials client-configuration executor-service))
  (^AWSElasticsearchAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSElasticsearchAsyncClient aws-credentials executor-service))
  (^AWSElasticsearchAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSElasticsearchAsyncClient client-configuration))
  (^AWSElasticsearchAsyncClient []
    (new AWSElasticsearchAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.elasticsearch.AWSElasticsearchAsyncClientBuilder`"
  (^com.amazonaws.services.elasticsearch.AWSElasticsearchAsyncClientBuilder []
    (AWSElasticsearchAsyncClient/asyncBuilder )))

(defn upgrade-elasticsearch-domain-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for request parameters to UpgradeElasticsearchDomain operation. - `com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpgradeElasticsearchDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.upgradeElasticsearchDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest request]
    (-> this (.upgradeElasticsearchDomainAsync request))))

(defn describe-elasticsearch-instance-type-limits-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to DescribeElasticsearchInstanceTypeLimits operation. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticsearchInstanceTypeLimits operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticsearchInstanceTypeLimitsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest request]
    (-> this (.describeElasticsearchInstanceTypeLimitsAsync request))))

(defn describe-elasticsearch-domain-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the DescribeElasticsearchDomain operation. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticsearchDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticsearchDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest request]
    (-> this (.describeElasticsearchDomainAsync request))))

(defn cancel-elasticsearch-service-software-update-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the CancelElasticsearchServiceSoftwareUpdate operation. Specifies the name of the Elasticsearch domain that you wish to cancel a service software update on. - `com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelElasticsearchServiceSoftwareUpdate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelElasticsearchServiceSoftwareUpdateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest request]
    (-> this (.cancelElasticsearchServiceSoftwareUpdateAsync request))))

(defn describe-reserved-elasticsearch-instance-offerings-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for parameters to DescribeReservedElasticsearchInstanceOfferings - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedElasticsearchInstanceOfferings operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedElasticsearchInstanceOfferingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest request]
    (-> this (.describeReservedElasticsearchInstanceOfferingsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSElasticsearchAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-tags-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the ListTags operation. Specify the ARN for the Elasticsearch domain to which the tags are attached that you want to view are attached. - `com.amazonaws.services.elasticsearch.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.ListTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.ListTagsRequest request]
    (-> this (.listTagsAsync request))))

(defn list-elasticsearch-versions-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the ListElasticsearchVersions operation. Use MaxResults to control the maximum number of results to retrieve in a single call. Use NextToken in response to retrieve more results. If the received response does not contain a NextToken, then there are no more results to retrieve. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListElasticsearchVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listElasticsearchVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest request]
    (-> this (.listElasticsearchVersionsAsync request))))

(defn list-domain-names-async
  "Description copied from interface: AWSElasticsearchAsync

  request - `com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomainNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.ListDomainNamesResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainNamesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest request]
    (-> this (.listDomainNamesAsync request))))

(defn get-compatible-elasticsearch-versions-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for request parameters to GetCompatibleElasticsearchVersions operation. - `com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCompatibleElasticsearchVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCompatibleElasticsearchVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest request]
    (-> this (.getCompatibleElasticsearchVersionsAsync request))))

(defn describe-elasticsearch-domains-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the DescribeElasticsearchDomains operation. By default, the API returns the status of all Elasticsearch domains. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticsearchDomains operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticsearchDomainsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest request]
    (-> this (.describeElasticsearchDomainsAsync request))))

(defn delete-elasticsearch-service-role-async
  "Description copied from interface: AWSElasticsearchAsync

  request - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteElasticsearchServiceRole operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteElasticsearchServiceRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest request]
    (-> this (.deleteElasticsearchServiceRoleAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSElasticsearchAsyncClient this]
    (-> this (.shutdown))))

(defn create-elasticsearch-domain-async
  "Description copied from interface: AWSElasticsearchAsync

  request - `com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateElasticsearchDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createElasticsearchDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest request]
    (-> this (.createElasticsearchDomainAsync request))))

(defn get-upgrade-status-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for request parameters to GetUpgradeStatus operation. - `com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUpgradeStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.GetUpgradeStatusResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUpgradeStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest request]
    (-> this (.getUpgradeStatusAsync request))))

(defn list-elasticsearch-instance-types-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the ListElasticsearchInstanceTypes operation. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListElasticsearchInstanceTypes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listElasticsearchInstanceTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest request]
    (-> this (.listElasticsearchInstanceTypesAsync request))))

(defn update-elasticsearch-domain-config-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the UpdateElasticsearchDomain operation. Specifies the type and number of instances in the domain cluster. - `com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateElasticsearchDomainConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateElasticsearchDomainConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest request]
    (-> this (.updateElasticsearchDomainConfigAsync request))))

(defn remove-tags-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the RemoveTags operation. Specify the ARN for the Elasticsearch domain from which you want to remove the specified TagKey. - `com.amazonaws.services.elasticsearch.model.RemoveTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.RemoveTagsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.RemoveTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.RemoveTagsRequest request]
    (-> this (.removeTagsAsync request))))

(defn describe-elasticsearch-domain-config-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the DescribeElasticsearchDomainConfig operation. Specifies the domain name for which you want configuration information. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticsearchDomainConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticsearchDomainConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest request]
    (-> this (.describeElasticsearchDomainConfigAsync request))))

(defn describe-reserved-elasticsearch-instances-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for parameters to DescribeReservedElasticsearchInstances - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedElasticsearchInstances operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedElasticsearchInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest request]
    (-> this (.describeReservedElasticsearchInstancesAsync request))))

(defn purchase-reserved-elasticsearch-instance-offering-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for parameters to PurchaseReservedElasticsearchInstanceOffering - `com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseReservedElasticsearchInstanceOffering operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseReservedElasticsearchInstanceOfferingAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest request]
    (-> this (.purchaseReservedElasticsearchInstanceOfferingAsync request))))

(defn delete-elasticsearch-domain-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the DeleteElasticsearchDomain operation. Specifies the name of the Elasticsearch domain that you want to delete. - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteElasticsearchDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteElasticsearchDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest request]
    (-> this (.deleteElasticsearchDomainAsync request))))

(defn start-elasticsearch-service-software-update-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the StartElasticsearchServiceSoftwareUpdate operation. Specifies the name of the Elasticsearch domain that you wish to schedule a service software update on. - `com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartElasticsearchServiceSoftwareUpdate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startElasticsearchServiceSoftwareUpdateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest request]
    (-> this (.startElasticsearchServiceSoftwareUpdateAsync request))))

(defn add-tags-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for the parameters to the AddTags operation. Specify the tags that you want to attach to the Elasticsearch domain. - `com.amazonaws.services.elasticsearch.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.AddTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.AddTagsRequest request]
    (-> this (.addTagsAsync request))))

(defn get-upgrade-history-async
  "Description copied from interface: AWSElasticsearchAsync

  request - Container for request parameters to GetUpgradeHistory operation. - `com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUpgradeHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUpgradeHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsyncClient this ^com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest request]
    (-> this (.getUpgradeHistoryAsync request))))

