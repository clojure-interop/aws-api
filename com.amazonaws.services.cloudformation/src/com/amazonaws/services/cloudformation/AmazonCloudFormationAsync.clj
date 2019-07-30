(ns com.amazonaws.services.cloudformation.AmazonCloudFormationAsync
  "Interface for accessing AWS CloudFormation asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCloudFormationAsync instead.


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
  (:import [com.amazonaws.services.cloudformation AmazonCloudFormationAsync]))

(defn describe-account-limits-async
  "Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in
   your account. For more information about account limits, see AWS
   CloudFormation Limits in the AWS CloudFormation User Guide.

  describe-account-limits-request - The input for the DescribeAccountLimits action. - `com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest describe-account-limits-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountLimitsAsync describe-account-limits-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest describe-account-limits-request]
    (-> this (.describeAccountLimitsAsync describe-account-limits-request))))

(defn cancel-update-stack-async
  "Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and
   reverts to the previous stack configuration.



   You can cancel only stacks that are in the UPDATE_IN_PROGRESS state.

  cancel-update-stack-request - The input for the CancelUpdateStack action. - `com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelUpdateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.CancelUpdateStackResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest cancel-update-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelUpdateStackAsync cancel-update-stack-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest cancel-update-stack-request]
    (-> this (.cancelUpdateStackAsync cancel-update-stack-request))))

(defn set-stack-policy-async
  "Sets a stack policy for a specified stack.

  set-stack-policy-request - The input for the SetStackPolicy action. - `com.amazonaws.services.cloudformation.model.SetStackPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetStackPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.SetStackPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.SetStackPolicyRequest set-stack-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setStackPolicyAsync set-stack-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.SetStackPolicyRequest set-stack-policy-request]
    (-> this (.setStackPolicyAsync set-stack-policy-request))))

(defn describe-stack-resource-drifts-async
  "Returns drift information for the resources that have been checked for drift in the specified stack. This
   includes actual and expected configuration values for resources where AWS CloudFormation detects configuration
   drift.


   For a given stack, there will be one StackResourceDrift for each stack resource that has been
   checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not
   currently support drift detection are not checked, and so not included. For a list of resources that support
   drift detection, see Resources that Support Drift Detection.


   Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect
   drift on all supported resources for a given stack.

  describe-stack-resource-drifts-request - `com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackResourceDrifts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest describe-stack-resource-drifts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackResourceDriftsAsync describe-stack-resource-drifts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest describe-stack-resource-drifts-request]
    (-> this (.describeStackResourceDriftsAsync describe-stack-resource-drifts-request))))

(defn describe-stack-set-async
  "Returns the description of the specified stack set.

  describe-stack-set-request - `com.amazonaws.services.cloudformation.model.DescribeStackSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackSetRequest describe-stack-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackSetAsync describe-stack-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackSetRequest describe-stack-set-request]
    (-> this (.describeStackSetAsync describe-stack-set-request))))

(defn create-stack-set-async
  "Creates a stack set.

  create-stack-set-request - `com.amazonaws.services.cloudformation.model.CreateStackSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStackSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.CreateStackSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.CreateStackSetRequest create-stack-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStackSetAsync create-stack-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.CreateStackSetRequest create-stack-set-request]
    (-> this (.createStackSetAsync create-stack-set-request))))

(defn list-stack-set-operation-results-async
  "Returns summary information about the results of a stack set operation.

  list-stack-set-operation-results-request - `com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackSetOperationResults operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest list-stack-set-operation-results-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackSetOperationResultsAsync list-stack-set-operation-results-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest list-stack-set-operation-results-request]
    (-> this (.listStackSetOperationResultsAsync list-stack-set-operation-results-request))))

(defn list-stack-instances-async
  "Returns summary information about stack instances that are associated with the specified stack set. You can
   filter for stack instances that are associated with a specific AWS account name or region.

  list-stack-instances-request - `com.amazonaws.services.cloudformation.model.ListStackInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStackInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStackInstancesRequest list-stack-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackInstancesAsync list-stack-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStackInstancesRequest list-stack-instances-request]
    (-> this (.listStackInstancesAsync list-stack-instances-request))))

(defn describe-stack-set-operation-async
  "Returns the description of the specified stack set operation.

  describe-stack-set-operation-request - `com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackSetOperation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest describe-stack-set-operation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackSetOperationAsync describe-stack-set-operation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest describe-stack-set-operation-request]
    (-> this (.describeStackSetOperationAsync describe-stack-set-operation-request))))

(defn list-stack-set-operations-async
  "Returns summary information about operations performed on a stack set.

  list-stack-set-operations-request - `com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackSetOperations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest list-stack-set-operations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackSetOperationsAsync list-stack-set-operations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest list-stack-set-operations-request]
    (-> this (.listStackSetOperationsAsync list-stack-set-operations-request))))

(defn delete-stack-instances-async
  "Deletes stack instances for the specified accounts, in the specified regions.

  delete-stack-instances-request - `com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStackInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest delete-stack-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStackInstancesAsync delete-stack-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest delete-stack-instances-request]
    (-> this (.deleteStackInstancesAsync delete-stack-instances-request))))

(defn stop-stack-set-operation-async
  "Stops an in-progress operation on a stack set and its associated stack instances.

  stop-stack-set-operation-request - `com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopStackSetOperation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.StopStackSetOperationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest stop-stack-set-operation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopStackSetOperationAsync stop-stack-set-operation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest stop-stack-set-operation-request]
    (-> this (.stopStackSetOperationAsync stop-stack-set-operation-request))))

(defn list-exports-async
  "Lists all exported output values in the account and region in which you call this action. Use this action to see
   the exported output values that you can import into other stacks. To import values, use the
   Fn::ImportValue  function.


   For more information, see  AWS
   CloudFormation Export Stack Output Values.

  list-exports-request - `com.amazonaws.services.cloudformation.model.ListExportsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListExports operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListExportsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListExportsRequest list-exports-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listExportsAsync list-exports-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListExportsRequest list-exports-request]
    (-> this (.listExportsAsync list-exports-request))))

(defn get-stack-policy-async
  "Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.

  get-stack-policy-request - The input for the GetStackPolicy action. - `com.amazonaws.services.cloudformation.model.GetStackPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStackPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.GetStackPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.GetStackPolicyRequest get-stack-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStackPolicyAsync get-stack-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.GetStackPolicyRequest get-stack-policy-request]
    (-> this (.getStackPolicyAsync get-stack-policy-request))))

(defn create-stack-instances-async
  "Creates stack instances for the specified accounts, within the specified regions. A stack instance refers to a
   stack in a specific account and region. Accounts and Regions are required
   parameters—you must specify at least one account and one region.

  create-stack-instances-request - `com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStackInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.CreateStackInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest create-stack-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStackInstancesAsync create-stack-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest create-stack-instances-request]
    (-> this (.createStackInstancesAsync create-stack-instances-request))))

(defn update-termination-protection-async
  "Updates termination protection for the specified stack. If a user attempts to delete a stack with termination
   protection enabled, the operation fails and the stack remains unchanged. For more information, see Protecting a Stack From Being Deleted
   in the AWS CloudFormation User Guide.


   For nested stacks, termination
   protection is set on the root stack and cannot be changed directly on the nested stack.

  update-termination-protection-request - `com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTerminationProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest update-termination-protection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTerminationProtectionAsync update-termination-protection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest update-termination-protection-request]
    (-> this (.updateTerminationProtectionAsync update-termination-protection-request))))

(defn delete-stack-set-async
  "Deletes a stack set. Before you can delete a stack set, all of its member stack instances must be deleted. For
   more information about how to do this, see DeleteStackInstances.

  delete-stack-set-request - `com.amazonaws.services.cloudformation.model.DeleteStackSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStackSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DeleteStackSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DeleteStackSetRequest delete-stack-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStackSetAsync delete-stack-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DeleteStackSetRequest delete-stack-set-request]
    (-> this (.deleteStackSetAsync delete-stack-set-request))))

(defn signal-resource-async
  "Sends a signal to the specified resource with a success or failure status. You can use the SignalResource API in
   conjunction with a creation policy or update policy. AWS CloudFormation doesn't proceed with a stack creation or
   update until resources receive the required number of signals or the timeout period is exceeded. The
   SignalResource API is useful in cases where you want to send signals from anywhere other than an Amazon EC2
   instance.

  signal-resource-request - The input for the SignalResource action. - `com.amazonaws.services.cloudformation.model.SignalResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SignalResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.SignalResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.SignalResourceRequest signal-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.signalResourceAsync signal-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.SignalResourceRequest signal-resource-request]
    (-> this (.signalResourceAsync signal-resource-request))))

(defn delete-stack-async
  "Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks do not
   show up in the DescribeStacks API if the deletion has been completed successfully.

  delete-stack-request - The input for DeleteStack action. - `com.amazonaws.services.cloudformation.model.DeleteStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DeleteStackResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DeleteStackRequest delete-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStackAsync delete-stack-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DeleteStackRequest delete-stack-request]
    (-> this (.deleteStackAsync delete-stack-request))))

(defn validate-template-async
  "Validates a specified template. AWS CloudFormation first checks if the template is valid JSON. If it isn't, AWS
   CloudFormation checks if the template is valid YAML. If both these checks fail, AWS CloudFormation returns a
   template validation error.

  validate-template-request - The input for ValidateTemplate action. - `com.amazonaws.services.cloudformation.model.ValidateTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ValidateTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ValidateTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ValidateTemplateRequest validate-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.validateTemplateAsync validate-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ValidateTemplateRequest validate-template-request]
    (-> this (.validateTemplateAsync validate-template-request))))

(defn list-imports-async
  "Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first
   use this action to see which stacks are using it. To see the exported output values in your account, see
   ListExports.


   For more information about importing an exported output value, see the
   Fn::ImportValue  function.

  list-imports-request - `com.amazonaws.services.cloudformation.model.ListImportsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListImports operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListImportsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListImportsRequest list-imports-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listImportsAsync list-imports-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListImportsRequest list-imports-request]
    (-> this (.listImportsAsync list-imports-request))))

(defn list-stacks-async
  "Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary
   information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no
   StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and
   stacks that have been deleted).

  list-stacks-request - The input for ListStacks action. - `com.amazonaws.services.cloudformation.model.ListStacksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStacksResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStacksRequest list-stacks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStacksAsync list-stacks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStacksRequest list-stacks-request]
    (-> this (.listStacksAsync list-stacks-request)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this]
    (-> this (.listStacksAsync))))

(defn get-template-summary-async
  "Returns information about a new or existing template. The GetTemplateSummary action is useful for
   viewing parameter information, such as default parameter values and parameter types, before you create or update
   a stack or stack set.


   You can use the GetTemplateSummary action when you submit a template, or you can get template
   information for a stack set, or a running or deleted stack.


   For deleted stacks, GetTemplateSummary returns the template information for up to 90 days after the
   stack has been deleted. If the template does not exist, a ValidationError is returned.

  get-template-summary-request - The input for the GetTemplateSummary action. - `com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTemplateSummary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest get-template-summary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTemplateSummaryAsync get-template-summary-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest get-template-summary-request]
    (-> this (.getTemplateSummaryAsync get-template-summary-request)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this]
    (-> this (.getTemplateSummaryAsync))))

(defn estimate-template-cost-async
  "Returns the estimated monthly cost of a template. The return value is an AWS Simple Monthly Calculator URL with a
   query string that describes the resources required to run the template.

  estimate-template-cost-request - The input for an EstimateTemplateCost action. - `com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EstimateTemplateCost operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest estimate-template-cost-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.estimateTemplateCostAsync estimate-template-cost-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest estimate-template-cost-request]
    (-> this (.estimateTemplateCostAsync estimate-template-cost-request)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this]
    (-> this (.estimateTemplateCostAsync))))

(defn delete-change-set-async
  "Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set.


   If the call successfully completes, AWS CloudFormation successfully deleted the change set.

  delete-change-set-request - The input for the DeleteChangeSet action. - `com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteChangeSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DeleteChangeSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest delete-change-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteChangeSetAsync delete-change-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest delete-change-set-request]
    (-> this (.deleteChangeSetAsync delete-change-set-request))))

(defn list-stack-sets-async
  "Returns summary information about stack sets that are associated with the user.

  list-stack-sets-request - `com.amazonaws.services.cloudformation.model.ListStackSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStackSetsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStackSetsRequest list-stack-sets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackSetsAsync list-stack-sets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStackSetsRequest list-stack-sets-request]
    (-> this (.listStackSetsAsync list-stack-sets-request))))

(defn describe-stack-drift-detection-status-async
  "Returns information about a stack drift detection operation. A stack drift detection operation detects whether a
   stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the
   stack template and any values specified as template parameters. A stack is considered to have drifted if one or
   more of its resources have drifted. For more information on stack and resource drift, see Detecting
   Unregulated Configuration Changes to Stacks and Resources.


   Use DetectStackDrift to initiate a stack drift detection operation. DetectStackDrift returns
   a StackDriftDetectionId you can use to monitor the progress of the operation using
   DescribeStackDriftDetectionStatus. Once the drift detection operation has completed, use
   DescribeStackResourceDrifts to return drift information about the stack and its resources.

  describe-stack-drift-detection-status-request - `com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackDriftDetectionStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest describe-stack-drift-detection-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackDriftDetectionStatusAsync describe-stack-drift-detection-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest describe-stack-drift-detection-status-request]
    (-> this (.describeStackDriftDetectionStatusAsync describe-stack-drift-detection-status-request))))

(defn describe-stacks-async
  "Returns the description for the specified stack; if no stack name was specified, then it returns the description
   for all the stacks created.



   If the stack does not exist, an AmazonCloudFormationException is returned.

  describe-stacks-request - The input for DescribeStacks action. - `com.amazonaws.services.cloudformation.model.DescribeStacksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStacksResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStacksRequest describe-stacks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStacksAsync describe-stacks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStacksRequest describe-stacks-request]
    (-> this (.describeStacksAsync describe-stacks-request)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this]
    (-> this (.describeStacksAsync))))

(defn describe-stack-events-async
  "Returns all stack related events for a specified stack in reverse chronological order. For more information about
   a stack's event history, go to Stacks in the AWS
   CloudFormation User Guide.



   You can list events for stacks that have failed to create or have been deleted by specifying the unique stack
   identifier (stack ID).

  describe-stack-events-request - The input for DescribeStackEvents action. - `com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackEventsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest describe-stack-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackEventsAsync describe-stack-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest describe-stack-events-request]
    (-> this (.describeStackEventsAsync describe-stack-events-request))))

(defn list-stack-resources-async
  "Returns descriptions of all resources of the specified stack.


   For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been
   deleted.

  list-stack-resources-request - The input for the ListStackResource action. - `com.amazonaws.services.cloudformation.model.ListStackResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListStackResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStackResourcesRequest list-stack-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackResourcesAsync list-stack-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListStackResourcesRequest list-stack-resources-request]
    (-> this (.listStackResourcesAsync list-stack-resources-request))))

(defn create-change-set-async
  "Creates a list of changes that will be applied to a stack so that you can review the changes before executing
   them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set
   for a stack that doesn't exist, the change set shows all of the resources that AWS CloudFormation will create. If
   you create a change set for an existing stack, AWS CloudFormation compares the stack's information with the
   information that you submit in the change set and lists the differences. Use change sets to understand which
   resources AWS CloudFormation will create or change, and how it will change resources in an existing stack, before
   you create or update a stack.


   To create a change set for a stack that doesn't exist, for the ChangeSetType parameter, specify
   CREATE. To create a change set for an existing stack, specify UPDATE for the
   ChangeSetType parameter. After the CreateChangeSet call successfully completes, AWS
   CloudFormation starts creating the change set. To check the status of the change set or to review it, use the
   DescribeChangeSet action.


   When you are satisfied with the changes the change set will make, execute the change set by using the
   ExecuteChangeSet action. AWS CloudFormation doesn't make changes until you execute the change set.

  create-change-set-request - The input for the CreateChangeSet action. - `com.amazonaws.services.cloudformation.model.CreateChangeSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateChangeSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.CreateChangeSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.CreateChangeSetRequest create-change-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createChangeSetAsync create-change-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.CreateChangeSetRequest create-change-set-request]
    (-> this (.createChangeSetAsync create-change-set-request))))

(defn detect-stack-resource-drift-async
  "Returns information about whether a resource's actual configuration differs, or has drifted, from it's
   expected configuration, as defined in the stack template and any values specified as template parameters. This
   information includes actual and expected property values for resources in which AWS CloudFormation detects drift.
   Only resource properties explicitly defined in the stack template are checked for drift. For more information
   about stack and resource drift, see Detecting
   Unregulated Configuration Changes to Stacks and Resources.


   Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to
   detect drift on all resources in a given stack that support drift detection.


   Resources that do not currently support drift detection cannot be checked. For a list of resources that support
   drift detection, see Resources that Support Drift Detection.

  detect-stack-resource-drift-request - `com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectStackResourceDrift operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DetectStackResourceDriftResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest detect-stack-resource-drift-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectStackResourceDriftAsync detect-stack-resource-drift-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest detect-stack-resource-drift-request]
    (-> this (.detectStackResourceDriftAsync detect-stack-resource-drift-request))))

(defn describe-change-set-async
  "Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the
   change set. For more information, see Updating Stacks Using Change Sets in the AWS CloudFormation User Guide.

  describe-change-set-request - The input for the DescribeChangeSet action. - `com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeChangeSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeChangeSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest describe-change-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeChangeSetAsync describe-change-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest describe-change-set-request]
    (-> this (.describeChangeSetAsync describe-change-set-request))))

(defn execute-change-set-async
  "Updates a stack using the input information that was provided when the specified change set was created. After
   the call successfully completes, AWS CloudFormation starts updating the stack. Use the DescribeStacks
   action to view the status of the update.


   When you execute a change set, AWS CloudFormation deletes all other change sets associated with the stack because
   they aren't valid for the updated stack.


   If a stack policy is associated with the stack, AWS CloudFormation enforces the policy during the update. You
   can't specify a temporary stack policy that overrides the current policy.

  execute-change-set-request - The input for the ExecuteChangeSet action. - `com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecuteChangeSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest execute-change-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executeChangeSetAsync execute-change-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest execute-change-set-request]
    (-> this (.executeChangeSetAsync execute-change-set-request))))

(defn continue-update-rollback-async
  "For a specified stack that is in the UPDATE_ROLLBACK_FAILED state, continues rolling it back to the
   UPDATE_ROLLBACK_COMPLETE state. Depending on the cause of the failure, you can manually  fix the error and continue the rollback. By continuing the rollback, you can return your stack to a working
   state (the UPDATE_ROLLBACK_COMPLETE state), and then try to update the stack again.


   A stack goes into the UPDATE_ROLLBACK_FAILED state when AWS CloudFormation cannot roll back all
   changes after a failed stack update. For example, you might have a stack that is rolling back to an old database
   instance that was deleted outside of AWS CloudFormation. Because AWS CloudFormation doesn't know the database was
   deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update
   rollback to fail.

  continue-update-rollback-request - The input for the ContinueUpdateRollback action. - `com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ContinueUpdateRollback operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest continue-update-rollback-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.continueUpdateRollbackAsync continue-update-rollback-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest continue-update-rollback-request]
    (-> this (.continueUpdateRollbackAsync continue-update-rollback-request))))

(defn describe-stack-instance-async
  "Returns the stack instance that's associated with the specified stack set, AWS account, and region.


   For a list of stack instances that are associated with a specific stack set, use ListStackInstances.

  describe-stack-instance-request - `com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest describe-stack-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackInstanceAsync describe-stack-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest describe-stack-instance-request]
    (-> this (.describeStackInstanceAsync describe-stack-instance-request))))

(defn list-change-sets-async
  "Returns the ID and status of each active change set for a stack. For example, AWS CloudFormation lists change
   sets that are in the CREATE_IN_PROGRESS or CREATE_PENDING state.

  list-change-sets-request - The input for the ListChangeSets action. - `com.amazonaws.services.cloudformation.model.ListChangeSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListChangeSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.ListChangeSetsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListChangeSetsRequest list-change-sets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listChangeSetsAsync list-change-sets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.ListChangeSetsRequest list-change-sets-request]
    (-> this (.listChangeSetsAsync list-change-sets-request))))

(defn detect-stack-drift-async
  "Detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration,
   as defined in the stack template and any values specified as template parameters. For each resource in the stack
   that supports drift detection, AWS CloudFormation compares the actual configuration of the resource with its
   expected template configuration. Only resource properties explicitly defined in the stack template are checked
   for drift. A stack is considered to have drifted if one or more of its resources differ from their expected
   template configurations. For more information, see Detecting
   Unregulated Configuration Changes to Stacks and Resources.


   Use DetectStackDrift to detect drift on all supported resources for a given stack, or
   DetectStackResourceDrift to detect drift on individual resources.


   For a list of stack resources that currently support drift detection, see Resources that Support Drift Detection.


   DetectStackDrift can take up to several minutes, depending on the number of resources contained
   within the stack. Use DescribeStackDriftDetectionStatus to monitor the progress of a detect stack drift
   operation. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return
   drift information about the stack and its resources.


   When detecting drift on a stack, AWS CloudFormation does not detect drift on any nested stacks belonging to that
   stack. Perform DetectStackDrift directly on the nested stack itself.

  detect-stack-drift-request - `com.amazonaws.services.cloudformation.model.DetectStackDriftRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectStackDrift operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DetectStackDriftResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DetectStackDriftRequest detect-stack-drift-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectStackDriftAsync detect-stack-drift-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DetectStackDriftRequest detect-stack-drift-request]
    (-> this (.detectStackDriftAsync detect-stack-drift-request))))

(defn update-stack-async
  "Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You
   can check the status of the stack via the DescribeStacks action.


   To get a copy of the template for an existing stack, you can use the GetTemplate action.


   For more information about creating an update template, updating a stack, and monitoring the progress of the
   update, see Updating a
   Stack.

  update-stack-request - The input for an UpdateStack action. - `com.amazonaws.services.cloudformation.model.UpdateStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.UpdateStackResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.UpdateStackRequest update-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStackAsync update-stack-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.UpdateStackRequest update-stack-request]
    (-> this (.updateStackAsync update-stack-request))))

(defn create-stack-async
  "Creates a stack as specified in the template. After the call completes successfully, the stack creation starts.
   You can check the status of the stack via the DescribeStacks API.

  create-stack-request - The input for CreateStack action. - `com.amazonaws.services.cloudformation.model.CreateStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.CreateStackResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.CreateStackRequest create-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStackAsync create-stack-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.CreateStackRequest create-stack-request]
    (-> this (.createStackAsync create-stack-request))))

(defn update-stack-instances-async
  "Updates the parameter values for stack instances for the specified accounts, within the specified regions. A
   stack instance refers to a stack in a specific account and region.


   You can only update stack instances in regions and accounts where they already exist; to create additional stack
   instances, use CreateStackInstances.


   During stack set updates, any parameters overridden for a stack instance are not updated, but retain their
   overridden value.


   You can only update the parameter values that are specified in the stack set; to add or delete a parameter
   itself, use UpdateStackSet
    to update the stack set template. If you add a parameter to a template, before you can override the
   parameter value specified in the stack set you must first use UpdateStackSet to update all stack instances with the updated template and parameter value specified in the
   stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter
   value using UpdateStackInstances.

  update-stack-instances-request - `com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStackInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest update-stack-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStackInstancesAsync update-stack-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest update-stack-instances-request]
    (-> this (.updateStackInstancesAsync update-stack-instances-request))))

(defn describe-stack-resources-async
  "Returns AWS resource descriptions for running and deleted stacks. If StackName is specified, all the
   associated resources that are part of the stack are returned. If PhysicalResourceId is specified,
   the associated resources of the stack that the resource belongs to are returned.



   Only the first 100 resources will be returned. If your stack has more resources than this, you should use
   ListStackResources instead.



   For deleted stacks, DescribeStackResources returns resource information for up to 90 days after the
   stack has been deleted.


   You must specify either StackName or PhysicalResourceId, but not both. In addition, you
   can specify LogicalResourceId to filter the returned result. For more information about resources,
   the LogicalResourceId and PhysicalResourceId, go to the AWS CloudFormation User Guide.



   A ValidationError is returned if you specify both StackName and
   PhysicalResourceId in the same request.

  describe-stack-resources-request - The input for DescribeStackResources action. - `com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest describe-stack-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackResourcesAsync describe-stack-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest describe-stack-resources-request]
    (-> this (.describeStackResourcesAsync describe-stack-resources-request))))

(defn get-template-async
  "Returns the template body for a specified stack. You can get the template for running or deleted stacks.


   For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.



   If the template does not exist, a ValidationError is returned.

  get-template-request - The input for a GetTemplate action. - `com.amazonaws.services.cloudformation.model.GetTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.GetTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.GetTemplateRequest get-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTemplateAsync get-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.GetTemplateRequest get-template-request]
    (-> this (.getTemplateAsync get-template-request))))

(defn update-stack-set-async
  "Updates the stack set, and associated stack instances in the specified accounts and regions.


   Even if the stack set operation created by updating the stack set fails (completely or partially, below or above
   a specified failure tolerance), the stack set is updated with your changes. Subsequent
   CreateStackInstances calls on the specified stack set use the updated stack set.

  update-stack-set-request - `com.amazonaws.services.cloudformation.model.UpdateStackSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStackSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.UpdateStackSetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.UpdateStackSetRequest update-stack-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStackSetAsync update-stack-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.UpdateStackSetRequest update-stack-set-request]
    (-> this (.updateStackSetAsync update-stack-set-request))))

(defn describe-stack-resource-async
  "Returns a description of the specified resource in the specified stack.


   For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been
   deleted.

  describe-stack-resource-request - The input for DescribeStackResource action. - `com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudformation.model.DescribeStackResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest describe-stack-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackResourceAsync describe-stack-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudFormationAsync this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest describe-stack-resource-request]
    (-> this (.describeStackResourceAsync describe-stack-resource-request))))

