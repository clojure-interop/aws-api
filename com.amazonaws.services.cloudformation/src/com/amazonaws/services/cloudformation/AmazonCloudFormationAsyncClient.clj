(ns com.amazonaws.services.cloudformation.AmazonCloudFormationAsyncClient
  "Client for accessing AWS CloudFormation asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS CloudFormation

  AWS CloudFormation allows you to create and manage AWS infrastructure deployments predictably and repeatedly. You can
  use AWS CloudFormation to leverage AWS products, such as Amazon Elastic Compute Cloud, Amazon Elastic Block Store,
  Amazon Simple Notification Service, Elastic Load Balancing, and Auto Scaling to build highly-reliable, highly
  scalable, cost-effective applications without creating or configuring the underlying AWS infrastructure.


  With AWS CloudFormation, you declare all of your resources and dependencies in a template file. The template defines
  a collection of resources as a single unit called a stack. AWS CloudFormation creates and deletes all member
  resources of the stack together and manages all dependencies between the resources for you.


  For more information about AWS CloudFormation, see the AWS
  CloudFormation Product Page.


  Amazon CloudFormation makes use of other AWS products. If you need additional technical information about a specific
  AWS product, you can find the product's technical documentation at docs.aws.amazon.com."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudformation AmazonCloudFormationAsyncClient]))

(defn ->amazon-cloud-formation-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonCloudFormationAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudFormationAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonCloudFormationAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudFormationAsyncClient aws-credentials executor-service))
  (^AmazonCloudFormationAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudFormationAsyncClient client-configuration))
  (^AmazonCloudFormationAsyncClient []
    (new AmazonCloudFormationAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.cloudformation.AmazonCloudFormationAsyncClientBuilder`"
  (^com.amazonaws.services.cloudformation.AmazonCloudFormationAsyncClientBuilder []
    (AmazonCloudFormationAsyncClient/asyncBuilder )))

(defn describe-account-limits-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the DescribeAccountLimits action. - `com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountLimitsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest request]
    (-> this (.describeAccountLimitsAsync request))))

(defn cancel-update-stack-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the CancelUpdateStack action. - `com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelUpdateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.CancelUpdateStackResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelUpdateStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest request]
    (-> this (.cancelUpdateStackAsync request))))

(defn set-stack-policy-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the SetStackPolicy action. - `com.amazonaws.services.cloudformation.model.SetStackPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetStackPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.SetStackPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.SetStackPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setStackPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.SetStackPolicyRequest request]
    (-> this (.setStackPolicyAsync request))))

(defn describe-stack-resource-drifts-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackResourceDrifts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackResourceDriftsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest request]
    (-> this (.describeStackResourceDriftsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonCloudFormationAsyncClient this]
    (-> this (.getExecutorService))))

(defn describe-stack-set-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.DescribeStackSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackSetRequest request]
    (-> this (.describeStackSetAsync request))))

(defn create-stack-set-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.CreateStackSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStackSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.CreateStackSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.CreateStackSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStackSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.CreateStackSetRequest request]
    (-> this (.createStackSetAsync request))))

(defn list-stack-set-operation-results-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackSetOperationResults operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackSetOperationResultsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest request]
    (-> this (.listStackSetOperationResultsAsync request))))

(defn list-stack-instances-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.ListStackInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStackInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStackInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStackInstancesRequest request]
    (-> this (.listStackInstancesAsync request))))

(defn describe-stack-set-operation-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackSetOperation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackSetOperationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest request]
    (-> this (.describeStackSetOperationAsync request))))

(defn list-stack-set-operations-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackSetOperations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackSetOperationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest request]
    (-> this (.listStackSetOperationsAsync request))))

(defn delete-stack-instances-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStackInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStackInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest request]
    (-> this (.deleteStackInstancesAsync request))))

(defn stop-stack-set-operation-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopStackSetOperation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.StopStackSetOperationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopStackSetOperationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest request]
    (-> this (.stopStackSetOperationAsync request))))

(defn list-exports-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.ListExportsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListExports operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListExportsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListExportsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listExportsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListExportsRequest request]
    (-> this (.listExportsAsync request))))

(defn get-stack-policy-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the GetStackPolicy action. - `com.amazonaws.services.cloudformation.model.GetStackPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStackPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.GetStackPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.GetStackPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStackPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.GetStackPolicyRequest request]
    (-> this (.getStackPolicyAsync request))))

(defn create-stack-instances-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStackInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.CreateStackInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStackInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest request]
    (-> this (.createStackInstancesAsync request))))

(defn update-termination-protection-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTerminationProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTerminationProtectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest request]
    (-> this (.updateTerminationProtectionAsync request))))

(defn delete-stack-set-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.DeleteStackSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStackSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DeleteStackSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DeleteStackSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStackSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DeleteStackSetRequest request]
    (-> this (.deleteStackSetAsync request))))

(defn signal-resource-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the SignalResource action. - `com.amazonaws.services.cloudformation.model.SignalResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SignalResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.SignalResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.SignalResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.signalResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.SignalResourceRequest request]
    (-> this (.signalResourceAsync request))))

(defn delete-stack-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for DeleteStack action. - `com.amazonaws.services.cloudformation.model.DeleteStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DeleteStackResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DeleteStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DeleteStackRequest request]
    (-> this (.deleteStackAsync request))))

(defn validate-template-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for ValidateTemplate action. - `com.amazonaws.services.cloudformation.model.ValidateTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ValidateTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ValidateTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ValidateTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.validateTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ValidateTemplateRequest request]
    (-> this (.validateTemplateAsync request))))

(defn list-imports-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.ListImportsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListImports operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListImportsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListImportsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listImportsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListImportsRequest request]
    (-> this (.listImportsAsync request))))

(defn list-stacks-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for ListStacks action. - `com.amazonaws.services.cloudformation.model.ListStacksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStacksResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStacksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStacksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStacksRequest request]
    (-> this (.listStacksAsync request)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this]
    (-> this (.listStacksAsync))))

(defn get-template-summary-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the GetTemplateSummary action. - `com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTemplateSummary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTemplateSummaryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest request]
    (-> this (.getTemplateSummaryAsync request)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this]
    (-> this (.getTemplateSummaryAsync))))

(defn estimate-template-cost-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for an EstimateTemplateCost action. - `com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EstimateTemplateCost operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.estimateTemplateCostAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest request]
    (-> this (.estimateTemplateCostAsync request)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this]
    (-> this (.estimateTemplateCostAsync))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonCloudFormationAsyncClient this]
    (-> this (.shutdown))))

(defn delete-change-set-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the DeleteChangeSet action. - `com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteChangeSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DeleteChangeSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteChangeSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest request]
    (-> this (.deleteChangeSetAsync request))))

(defn list-stack-sets-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.ListStackSetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStackSetsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStackSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStackSetsRequest request]
    (-> this (.listStackSetsAsync request))))

(defn describe-stack-drift-detection-status-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackDriftDetectionStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackDriftDetectionStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest request]
    (-> this (.describeStackDriftDetectionStatusAsync request))))

(defn describe-stacks-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for DescribeStacks action. - `com.amazonaws.services.cloudformation.model.DescribeStacksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStacksResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStacksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStacksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStacksRequest request]
    (-> this (.describeStacksAsync request)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this]
    (-> this (.describeStacksAsync))))

(defn describe-stack-events-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for DescribeStackEvents action. - `com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackEventsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest request]
    (-> this (.describeStackEventsAsync request))))

(defn list-stack-resources-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the ListStackResource action. - `com.amazonaws.services.cloudformation.model.ListStackResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStackResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStackResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListStackResourcesRequest request]
    (-> this (.listStackResourcesAsync request))))

(defn create-change-set-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the CreateChangeSet action. - `com.amazonaws.services.cloudformation.model.CreateChangeSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateChangeSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.CreateChangeSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.CreateChangeSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createChangeSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.CreateChangeSetRequest request]
    (-> this (.createChangeSetAsync request))))

(defn detect-stack-resource-drift-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectStackResourceDrift operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DetectStackResourceDriftResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectStackResourceDriftAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest request]
    (-> this (.detectStackResourceDriftAsync request))))

(defn describe-change-set-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the DescribeChangeSet action. - `com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeChangeSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeChangeSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeChangeSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest request]
    (-> this (.describeChangeSetAsync request))))

(defn execute-change-set-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the ExecuteChangeSet action. - `com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecuteChangeSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executeChangeSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest request]
    (-> this (.executeChangeSetAsync request))))

(defn continue-update-rollback-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the ContinueUpdateRollback action. - `com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ContinueUpdateRollback operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.continueUpdateRollbackAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest request]
    (-> this (.continueUpdateRollbackAsync request))))

(defn describe-stack-instance-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest request]
    (-> this (.describeStackInstanceAsync request))))

(defn list-change-sets-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for the ListChangeSets action. - `com.amazonaws.services.cloudformation.model.ListChangeSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListChangeSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListChangeSetsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListChangeSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listChangeSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.ListChangeSetsRequest request]
    (-> this (.listChangeSetsAsync request))))

(defn detect-stack-drift-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.DetectStackDriftRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectStackDrift operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DetectStackDriftResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DetectStackDriftRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectStackDriftAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DetectStackDriftRequest request]
    (-> this (.detectStackDriftAsync request))))

(defn update-stack-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for an UpdateStack action. - `com.amazonaws.services.cloudformation.model.UpdateStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.UpdateStackResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.UpdateStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.UpdateStackRequest request]
    (-> this (.updateStackAsync request))))

(defn create-stack-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for CreateStack action. - `com.amazonaws.services.cloudformation.model.CreateStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.CreateStackResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.CreateStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.CreateStackRequest request]
    (-> this (.createStackAsync request))))

(defn update-stack-instances-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStackInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStackInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest request]
    (-> this (.updateStackInstancesAsync request))))

(defn describe-stack-resources-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for DescribeStackResources action. - `com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest request]
    (-> this (.describeStackResourcesAsync request))))

(defn get-template-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for a GetTemplate action. - `com.amazonaws.services.cloudformation.model.GetTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.GetTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.GetTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.GetTemplateRequest request]
    (-> this (.getTemplateAsync request))))

(defn update-stack-set-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - `com.amazonaws.services.cloudformation.model.UpdateStackSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStackSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.UpdateStackSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.UpdateStackSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStackSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.UpdateStackSetRequest request]
    (-> this (.updateStackSetAsync request))))

(defn describe-stack-resource-async
  "Description copied from interface: AmazonCloudFormationAsync

  request - The input for DescribeStackResource action. - `com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsyncClient this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest request]
    (-> this (.describeStackResourceAsync request))))

