package be.seriousbusiness;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.maven.enforcer.rule.api.EnforcerRule;
import org.apache.maven.enforcer.rule.api.EnforcerRuleException;
import org.apache.maven.enforcer.rule.api.EnforcerRuleHelper;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.component.configurator.expression.ExpressionEvaluationException;

import static java.lang.String.format;

/**
 * Serious Project Rule. Enforce the serousness!
 */
public class SeriousProject implements EnforcerRule {

    /**
     * Enforce a project's group id to start with given value.
     * </br>By default this is 'be.seriousbusiness'.
     */
    private String groupIdStartsWith = "be.seriousbusiness";

    @Override
    public void execute(@Nonnull final EnforcerRuleHelper enforcerRuleHelper) throws EnforcerRuleException {
        final Log log = enforcerRuleHelper.getLog();

        log.info("# Serious Project Enforcer");
        log.info(format("Enforce group id starts with '%s'", groupIdStartsWith));

        if (Objects.isNull(groupIdStartsWith) || groupIdStartsWith.isBlank()) {
            throw new EnforcerRuleException(
                    "The group id cannot be enforced to start with a blank value! Please specify a valid 'groupIdStartsWith' param or remove it.");
        }

        try {
            final MavenProject project = (MavenProject) enforcerRuleHelper.evaluate("${project}");
            final String groupId = project.getGroupId();

            if (!groupId.startsWith(groupIdStartsWith)) {
                throw new EnforcerRuleException(format("Project's group id '%s' does not start with '%s'!", groupId, groupIdStartsWith));
            }

            final String projectName = project.getName();
            log.info(format("Enforce the project name '%s' is set", projectName));

            if (Objects.isNull(projectName) || projectName.isBlank()) {
                throw new EnforcerRuleException("Project's name is missing, get serious!");
            }

            log.info("You are s00000o serious!");
        } catch (final ExpressionEvaluationException e) {
            throw new EnforcerRuleException("Failed evaluating expression", e);
        }
    }

    @Override
    public boolean isCacheable() {
        return false;
    }

    @Override
    public boolean isResultValid(@Nonnull final EnforcerRule enforcerRule) {
        return false;
    }

    @Nullable
    @Override
    public String getCacheId() {
        return null;
    }
}
