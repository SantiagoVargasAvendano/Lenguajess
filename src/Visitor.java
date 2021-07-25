import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Visitor<T> extends CPP14ParserBaseVisitor<T> {
    @Override
    public T visitTranslationUnit(CPP14Parser.TranslationUnitContext ctx) {
        return null;
    }

    @Override
    public T visitPrimaryExpression(CPP14Parser.PrimaryExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitIdExpression(CPP14Parser.IdExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitUnqualifiedId(CPP14Parser.UnqualifiedIdContext ctx) {
        return null;
    }

    @Override
    public T visitQualifiedId(CPP14Parser.QualifiedIdContext ctx) {
        return null;
    }

    @Override
    public T visitNestedNameSpecifier(CPP14Parser.NestedNameSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitLambdaExpression(CPP14Parser.LambdaExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitLambdaIntroducer(CPP14Parser.LambdaIntroducerContext ctx) {
        return null;
    }

    @Override
    public T visitLambdaCapture(CPP14Parser.LambdaCaptureContext ctx) {
        return null;
    }

    @Override
    public T visitCaptureDefault(CPP14Parser.CaptureDefaultContext ctx) {
        return null;
    }

    @Override
    public T visitCaptureList(CPP14Parser.CaptureListContext ctx) {
        return null;
    }

    @Override
    public T visitCapture(CPP14Parser.CaptureContext ctx) {
        return null;
    }

    @Override
    public T visitSimpleCapture(CPP14Parser.SimpleCaptureContext ctx) {
        return null;
    }

    @Override
    public T visitInitcapture(CPP14Parser.InitcaptureContext ctx) {
        return null;
    }

    @Override
    public T visitLambdaDeclarator(CPP14Parser.LambdaDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitPostfixExpression(CPP14Parser.PostfixExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitTypeIdOfTheTypeId(CPP14Parser.TypeIdOfTheTypeIdContext ctx) {
        return null;
    }

    @Override
    public T visitExpressionList(CPP14Parser.ExpressionListContext ctx) {
        return null;
    }

    @Override
    public T visitPseudoDestructorName(CPP14Parser.PseudoDestructorNameContext ctx) {
        return null;
    }

    @Override
    public T visitUnaryExpression(CPP14Parser.UnaryExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitUnaryOperator(CPP14Parser.UnaryOperatorContext ctx) {
        return null;
    }

    @Override
    public T visitNewExpression(CPP14Parser.NewExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitNewPlacement(CPP14Parser.NewPlacementContext ctx) {
        return null;
    }

    @Override
    public T visitNewTypeId(CPP14Parser.NewTypeIdContext ctx) {
        return null;
    }

    @Override
    public T visitNewDeclarator(CPP14Parser.NewDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitNoPointerNewDeclarator(CPP14Parser.NoPointerNewDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitNewInitializer(CPP14Parser.NewInitializerContext ctx) {
        return null;
    }

    @Override
    public T visitDeleteExpression(CPP14Parser.DeleteExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitNoExceptExpression(CPP14Parser.NoExceptExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitCastExpression(CPP14Parser.CastExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitPointerMemberExpression(CPP14Parser.PointerMemberExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitMultiplicativeExpression(CPP14Parser.MultiplicativeExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitAdditiveExpression(CPP14Parser.AdditiveExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitShiftExpression(CPP14Parser.ShiftExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitShiftOperator(CPP14Parser.ShiftOperatorContext ctx) {
        return null;
    }

    @Override
    public T visitRelationalExpression(CPP14Parser.RelationalExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitEqualityExpression(CPP14Parser.EqualityExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitAndExpression(CPP14Parser.AndExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitExclusiveOrExpression(CPP14Parser.ExclusiveOrExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitInclusiveOrExpression(CPP14Parser.InclusiveOrExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitLogicalAndExpression(CPP14Parser.LogicalAndExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitLogicalOrExpression(CPP14Parser.LogicalOrExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitConditionalExpression(CPP14Parser.ConditionalExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitAssignmentExpression(CPP14Parser.AssignmentExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitAssignmentOperator(CPP14Parser.AssignmentOperatorContext ctx) {
        return null;
    }

    @Override
    public T visitExpression(CPP14Parser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitConstantExpression(CPP14Parser.ConstantExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitStatement(CPP14Parser.StatementContext ctx) {
        return null;
    }

    @Override
    public T visitLabeledStatement(CPP14Parser.LabeledStatementContext ctx) {
        return null;
    }

    @Override
    public T visitExpressionStatement(CPP14Parser.ExpressionStatementContext ctx) {
        return null;
    }

    @Override
    public T visitCompoundStatement(CPP14Parser.CompoundStatementContext ctx) {
        return null;
    }

    @Override
    public T visitStatementSeq(CPP14Parser.StatementSeqContext ctx) {
        return null;
    }

    @Override
    public T visitSelectionStatement(CPP14Parser.SelectionStatementContext ctx) {
        return null;
    }

    @Override
    public T visitCondition(CPP14Parser.ConditionContext ctx) {
        return null;
    }

    @Override
    public T visitIterationStatement(CPP14Parser.IterationStatementContext ctx) {
        return null;
    }

    @Override
    public T visitForInitStatement(CPP14Parser.ForInitStatementContext ctx) {
        return null;
    }

    @Override
    public T visitForRangeDeclaration(CPP14Parser.ForRangeDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitForRangeInitializer(CPP14Parser.ForRangeInitializerContext ctx) {
        return null;
    }

    @Override
    public T visitJumpStatement(CPP14Parser.JumpStatementContext ctx) {
        return null;
    }

    @Override
    public T visitDeclarationStatement(CPP14Parser.DeclarationStatementContext ctx) {
        return null;
    }

    @Override
    public T visitDeclarationseq(CPP14Parser.DeclarationseqContext ctx) {
        return null;
    }

    @Override
    public T visitDeclaration(CPP14Parser.DeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitBlockDeclaration(CPP14Parser.BlockDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitAliasDeclaration(CPP14Parser.AliasDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitSimpleDeclaration(CPP14Parser.SimpleDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitStaticAssertDeclaration(CPP14Parser.StaticAssertDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitEmptyDeclaration(CPP14Parser.EmptyDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitAttributeDeclaration(CPP14Parser.AttributeDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitDeclSpecifier(CPP14Parser.DeclSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitDeclSpecifierSeq(CPP14Parser.DeclSpecifierSeqContext ctx) {
        return null;
    }

    @Override
    public T visitStorageClassSpecifier(CPP14Parser.StorageClassSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitFunctionSpecifier(CPP14Parser.FunctionSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitTypedefName(CPP14Parser.TypedefNameContext ctx) {
        return null;
    }

    @Override
    public T visitTypeSpecifier(CPP14Parser.TypeSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitTrailingTypeSpecifier(CPP14Parser.TrailingTypeSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitTypeSpecifierSeq(CPP14Parser.TypeSpecifierSeqContext ctx) {
        return null;
    }

    @Override
    public T visitTrailingTypeSpecifierSeq(CPP14Parser.TrailingTypeSpecifierSeqContext ctx) {
        return null;
    }

    @Override
    public T visitSimpleTypeLengthModifier(CPP14Parser.SimpleTypeLengthModifierContext ctx) {
        return null;
    }

    @Override
    public T visitSimpleTypeSignednessModifier(CPP14Parser.SimpleTypeSignednessModifierContext ctx) {
        return null;
    }

    @Override
    public T visitSimpleTypeSpecifier(CPP14Parser.SimpleTypeSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitTheTypeName(CPP14Parser.TheTypeNameContext ctx) {
        return null;
    }

    @Override
    public T visitDecltypeSpecifier(CPP14Parser.DecltypeSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitElaboratedTypeSpecifier(CPP14Parser.ElaboratedTypeSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitEnumName(CPP14Parser.EnumNameContext ctx) {
        return null;
    }

    @Override
    public T visitEnumSpecifier(CPP14Parser.EnumSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitEnumHead(CPP14Parser.EnumHeadContext ctx) {
        return null;
    }

    @Override
    public T visitOpaqueEnumDeclaration(CPP14Parser.OpaqueEnumDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitEnumkey(CPP14Parser.EnumkeyContext ctx) {
        return null;
    }

    @Override
    public T visitEnumbase(CPP14Parser.EnumbaseContext ctx) {
        return null;
    }

    @Override
    public T visitEnumeratorList(CPP14Parser.EnumeratorListContext ctx) {
        return null;
    }

    @Override
    public T visitEnumeratorDefinition(CPP14Parser.EnumeratorDefinitionContext ctx) {
        return null;
    }

    @Override
    public T visitEnumerator(CPP14Parser.EnumeratorContext ctx) {
        return null;
    }

    @Override
    public T visitNamespaceName(CPP14Parser.NamespaceNameContext ctx) {
        return null;
    }

    @Override
    public T visitOriginalNamespaceName(CPP14Parser.OriginalNamespaceNameContext ctx) {
        return null;
    }

    @Override
    public T visitNamespaceDefinition(CPP14Parser.NamespaceDefinitionContext ctx) {
        return null;
    }

    @Override
    public T visitNamespaceAlias(CPP14Parser.NamespaceAliasContext ctx) {
        return null;
    }

    @Override
    public T visitNamespaceAliasDefinition(CPP14Parser.NamespaceAliasDefinitionContext ctx) {
        return null;
    }

    @Override
    public T visitQualifiednamespacespecifier(CPP14Parser.QualifiednamespacespecifierContext ctx) {
        return null;
    }

    @Override
    public T visitUsingDeclaration(CPP14Parser.UsingDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitUsingDirective(CPP14Parser.UsingDirectiveContext ctx) {
        return null;
    }

    @Override
    public T visitAsmDefinition(CPP14Parser.AsmDefinitionContext ctx) {
        return null;
    }

    @Override
    public T visitLinkageSpecification(CPP14Parser.LinkageSpecificationContext ctx) {
        return null;
    }

    @Override
    public T visitAttributeSpecifierSeq(CPP14Parser.AttributeSpecifierSeqContext ctx) {
        return null;
    }

    @Override
    public T visitAttributeSpecifier(CPP14Parser.AttributeSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitAlignmentspecifier(CPP14Parser.AlignmentspecifierContext ctx) {
        return null;
    }

    @Override
    public T visitAttributeList(CPP14Parser.AttributeListContext ctx) {
        return null;
    }

    @Override
    public T visitAttribute(CPP14Parser.AttributeContext ctx) {
        return null;
    }

    @Override
    public T visitAttributeNamespace(CPP14Parser.AttributeNamespaceContext ctx) {
        return null;
    }

    @Override
    public T visitAttributeArgumentClause(CPP14Parser.AttributeArgumentClauseContext ctx) {
        return null;
    }

    @Override
    public T visitBalancedTokenSeq(CPP14Parser.BalancedTokenSeqContext ctx) {
        return null;
    }

    @Override
    public T visitBalancedtoken(CPP14Parser.BalancedtokenContext ctx) {
        return null;
    }

    @Override
    public T visitInitDeclaratorList(CPP14Parser.InitDeclaratorListContext ctx) {
        return null;
    }

    @Override
    public T visitInitDeclarator(CPP14Parser.InitDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitDeclarator(CPP14Parser.DeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitPointerDeclarator(CPP14Parser.PointerDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitNoPointerDeclarator(CPP14Parser.NoPointerDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitParametersAndQualifiers(CPP14Parser.ParametersAndQualifiersContext ctx) {
        return null;
    }

    @Override
    public T visitTrailingReturnType(CPP14Parser.TrailingReturnTypeContext ctx) {
        return null;
    }

    @Override
    public T visitPointerOperator(CPP14Parser.PointerOperatorContext ctx) {
        return null;
    }

    @Override
    public T visitCvqualifierseq(CPP14Parser.CvqualifierseqContext ctx) {
        return null;
    }

    @Override
    public T visitCvQualifier(CPP14Parser.CvQualifierContext ctx) {
        return null;
    }

    @Override
    public T visitRefqualifier(CPP14Parser.RefqualifierContext ctx) {
        return null;
    }

    @Override
    public T visitDeclaratorid(CPP14Parser.DeclaratoridContext ctx) {
        return null;
    }

    @Override
    public T visitTheTypeId(CPP14Parser.TheTypeIdContext ctx) {
        return null;
    }

    @Override
    public T visitAbstractDeclarator(CPP14Parser.AbstractDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitPointerAbstractDeclarator(CPP14Parser.PointerAbstractDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitNoPointerAbstractDeclarator(CPP14Parser.NoPointerAbstractDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitAbstractPackDeclarator(CPP14Parser.AbstractPackDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitNoPointerAbstractPackDeclarator(CPP14Parser.NoPointerAbstractPackDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitParameterDeclarationClause(CPP14Parser.ParameterDeclarationClauseContext ctx) {
        return null;
    }

    @Override
    public T visitParameterDeclarationList(CPP14Parser.ParameterDeclarationListContext ctx) {
        return null;
    }

    @Override
    public T visitParameterDeclaration(CPP14Parser.ParameterDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitFunctionDefinition(CPP14Parser.FunctionDefinitionContext ctx) {
        return null;
    }

    @Override
    public T visitFunctionBody(CPP14Parser.FunctionBodyContext ctx) {
        return null;
    }

    @Override
    public T visitInitializer(CPP14Parser.InitializerContext ctx) {
        return null;
    }

    @Override
    public T visitBraceOrEqualInitializer(CPP14Parser.BraceOrEqualInitializerContext ctx) {
        return null;
    }

    @Override
    public T visitInitializerClause(CPP14Parser.InitializerClauseContext ctx) {
        return null;
    }

    @Override
    public T visitInitializerList(CPP14Parser.InitializerListContext ctx) {
        return null;
    }

    @Override
    public T visitBracedInitList(CPP14Parser.BracedInitListContext ctx) {
        return null;
    }

    @Override
    public T visitClassName(CPP14Parser.ClassNameContext ctx) {
        return null;
    }

    @Override
    public T visitClassSpecifier(CPP14Parser.ClassSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitClassHead(CPP14Parser.ClassHeadContext ctx) {
        return null;
    }

    @Override
    public T visitClassHeadName(CPP14Parser.ClassHeadNameContext ctx) {
        return null;
    }

    @Override
    public T visitClassVirtSpecifier(CPP14Parser.ClassVirtSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitClassKey(CPP14Parser.ClassKeyContext ctx) {
        return null;
    }

    @Override
    public T visitMemberSpecification(CPP14Parser.MemberSpecificationContext ctx) {
        return null;
    }

    @Override
    public T visitMemberdeclaration(CPP14Parser.MemberdeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitMemberDeclaratorList(CPP14Parser.MemberDeclaratorListContext ctx) {
        return null;
    }

    @Override
    public T visitMemberDeclarator(CPP14Parser.MemberDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitVirtualSpecifierSeq(CPP14Parser.VirtualSpecifierSeqContext ctx) {
        return null;
    }

    @Override
    public T visitVirtualSpecifier(CPP14Parser.VirtualSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitPureSpecifier(CPP14Parser.PureSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitBaseClause(CPP14Parser.BaseClauseContext ctx) {
        return null;
    }

    @Override
    public T visitBaseSpecifierList(CPP14Parser.BaseSpecifierListContext ctx) {
        return null;
    }

    @Override
    public T visitBaseSpecifier(CPP14Parser.BaseSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitClassOrDeclType(CPP14Parser.ClassOrDeclTypeContext ctx) {
        return null;
    }

    @Override
    public T visitBaseTypeSpecifier(CPP14Parser.BaseTypeSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitAccessSpecifier(CPP14Parser.AccessSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitConversionFunctionId(CPP14Parser.ConversionFunctionIdContext ctx) {
        return null;
    }

    @Override
    public T visitConversionTypeId(CPP14Parser.ConversionTypeIdContext ctx) {
        return null;
    }

    @Override
    public T visitConversionDeclarator(CPP14Parser.ConversionDeclaratorContext ctx) {
        return null;
    }

    @Override
    public T visitConstructorInitializer(CPP14Parser.ConstructorInitializerContext ctx) {
        return null;
    }

    @Override
    public T visitMemInitializerList(CPP14Parser.MemInitializerListContext ctx) {
        return null;
    }

    @Override
    public T visitMemInitializer(CPP14Parser.MemInitializerContext ctx) {
        return null;
    }

    @Override
    public T visitMeminitializerid(CPP14Parser.MeminitializeridContext ctx) {
        return null;
    }

    @Override
    public T visitOperatorFunctionId(CPP14Parser.OperatorFunctionIdContext ctx) {
        return null;
    }

    @Override
    public T visitLiteralOperatorId(CPP14Parser.LiteralOperatorIdContext ctx) {
        return null;
    }

    @Override
    public T visitTemplateDeclaration(CPP14Parser.TemplateDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitTemplateparameterList(CPP14Parser.TemplateparameterListContext ctx) {
        return null;
    }

    @Override
    public T visitTemplateParameter(CPP14Parser.TemplateParameterContext ctx) {
        return null;
    }

    @Override
    public T visitTypeParameter(CPP14Parser.TypeParameterContext ctx) {
        return null;
    }

    @Override
    public T visitSimpleTemplateId(CPP14Parser.SimpleTemplateIdContext ctx) {
        return null;
    }

    @Override
    public T visitTemplateId(CPP14Parser.TemplateIdContext ctx) {
        return null;
    }

    @Override
    public T visitTemplateName(CPP14Parser.TemplateNameContext ctx) {
        return null;
    }

    @Override
    public T visitTemplateArgumentList(CPP14Parser.TemplateArgumentListContext ctx) {
        return null;
    }

    @Override
    public T visitTemplateArgument(CPP14Parser.TemplateArgumentContext ctx) {
        return null;
    }

    @Override
    public T visitTypeNameSpecifier(CPP14Parser.TypeNameSpecifierContext ctx) {
        return null;
    }

    @Override
    public T visitExplicitInstantiation(CPP14Parser.ExplicitInstantiationContext ctx) {
        return null;
    }

    @Override
    public T visitExplicitSpecialization(CPP14Parser.ExplicitSpecializationContext ctx) {
        return null;
    }

    @Override
    public T visitTryBlock(CPP14Parser.TryBlockContext ctx) {
        return null;
    }

    @Override
    public T visitFunctionTryBlock(CPP14Parser.FunctionTryBlockContext ctx) {
        return null;
    }

    @Override
    public T visitHandlerSeq(CPP14Parser.HandlerSeqContext ctx) {
        return null;
    }

    @Override
    public T visitHandler(CPP14Parser.HandlerContext ctx) {
        return null;
    }

    @Override
    public T visitExceptionDeclaration(CPP14Parser.ExceptionDeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitThrowExpression(CPP14Parser.ThrowExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitExceptionSpecification(CPP14Parser.ExceptionSpecificationContext ctx) {
        return null;
    }

    @Override
    public T visitDynamicExceptionSpecification(CPP14Parser.DynamicExceptionSpecificationContext ctx) {
        return null;
    }

    @Override
    public T visitTypeIdList(CPP14Parser.TypeIdListContext ctx) {
        return null;
    }

    @Override
    public T visitNoeExceptSpecification(CPP14Parser.NoeExceptSpecificationContext ctx) {
        return null;
    }

    @Override
    public T visitTheOperator(CPP14Parser.TheOperatorContext ctx) {
        return null;
    }

    @Override
    public T visitLiteral(CPP14Parser.LiteralContext ctx) {
        return null;
    }

    @Override
    public T visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public T visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public T visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public T visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
